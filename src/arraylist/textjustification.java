package arraylist;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Prasannakshi on 4/2/2017.
 */
public class textjustification {
    static ArrayList<String> result = new ArrayList<>();

    public static void main(String args[]){
        ArrayList<String> input = new ArrayList<>(Arrays.asList("This", "is", "an", "example", "of", "text", "justification."));
        justify(input,"",16,0);
        for(String k: result){
            System.out.println(k);
        }
    }

    private static void justify(ArrayList<String> input, String addon, int l, int i) {
        String text = addon;

        if(i>input.size()-1){
            result.add(addon);
            return;
        }

        if(input.get(i).length()<l){
            addon += input.get(i);
        }

        if(addon.length()<l){
            justify(input,addon + " ",l,i+1);
        } else {
            result.add(text);
            justify(input,"",l,i);
        }
    }
}
