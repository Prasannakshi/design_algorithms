package dynammicprogramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by Prasannakshi on 10/31/2017.
 */
public class shoppingoffers {
    public static int shoppingOffers(List<Integer> price, List<List<Integer>> special, List<Integer> needs) {
        int result = Integer.MAX_VALUE;
        //apply each offer to the needs, and recurse
        for(int i = 0; i < special.size(); i++) {
            List<Integer> offer = special.get(i);
            boolean invalidOffer = false;
            for(int j = 0; j < needs.size(); j++) { // subtract offer items from needs
                int remain = needs.get(j) - offer.get(j);
                needs.set(j, remain);
                if(!invalidOffer && remain < 0) invalidOffer = true; // if offer has more items than needs
            }
            if(!invalidOffer) { //if valid offer, add offer price and recurse remaining needs
                result = Math.min(result, shoppingOffers(price, special, needs) + offer.get(needs.size()));
            }
            for(int j = 0; j < needs.size(); j++) { // reset the needs
                int remain = needs.get(j) + offer.get(j);
                needs.set(j, remain);
            }
        }
        // choose b/w offer and non offer
        int nonOfferPrice = 0;
        for(int i = 0; i < needs.size(); i++) {
            nonOfferPrice += price.get(i) * needs.get(i);
        }
        return Math.min(result, nonOfferPrice);
    }
    public static void main(String args[]){
        List<Integer> price = new ArrayList<>(Arrays.asList(2,3,4));
        List<List<Integer>> special = new ArrayList<>();
        special.add(new ArrayList<>(Arrays.asList(1,1,0,4)));
        special.add(new ArrayList<>(Arrays.asList(2,2,1,9)));
        List<Integer> needs = new ArrayList<>(Arrays.asList(1,2,1));
        int result = shoppingOffers(price,special,needs);
    }
}
