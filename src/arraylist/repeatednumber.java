import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * Created by Prasannakshi on 2/28/2017.
 */
public class repeatednumber {
    public static ArrayList<Integer> repeatedNumber(final List<Integer> a) {
        int sum=0;
        ArrayList<Integer> output = new ArrayList();
        HashMap<Integer,Integer> ditto = new HashMap<>();
        for(int i=0;i<a.size();i++){
            if(ditto.containsKey(a.get(i))){output.add(a.get(i));}
            else{
                ditto.put(a.get(i),1);
                sum+=a.get(i);
            }
        }
        int s = (a.size()*(a.size()+1))/2;
        output.add(s-sum);
        return output;
    }
    public static void main(String args[]){
        List<Integer> input = new ArrayList<>();
        input.add(3);
        input.add(1);
        input.add(2);
        input.add(5);
        input.add(3);
        ArrayList<Integer> output = repeatedNumber(input);
    }
}
