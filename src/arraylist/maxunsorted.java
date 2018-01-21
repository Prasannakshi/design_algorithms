import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by Prasannakshi on 3/21/2017.
 */
public class maxunsorted {
    public static void main(String args[]){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(16, 6, 18, 17, 13, 6, 18, 16, 6, 15, 15, 18, 16, 13, 16, 16, 6, 18, 15, 15));
        ArrayList<Integer> ouput = sortsubarray(input);
        for(Integer i:ouput){
            System.out.print(i+",");
        }
    }

    private static ArrayList<Integer> sortsubarray(ArrayList<Integer> input) {
        ArrayList<Integer> result = new ArrayList<>();
        int max=0,min=Integer.MAX_VALUE,s=0,e=0;
        for(int i=0;i<input.size()-1;i++){
            if(input.get(i)>input.get(i+1)){
                s = i;
                break;
            }
        }

        for(int i=input.size()-1;i>1;i--){
            if(input.get(i)<input.get(i-1)){
                e = i;
                break;
            }
        }

        for(int j=s; j<=e;j++){
            if(min>input.get(j))
                min = input.get(j);

            if(max<input.get(j))
                max=input.get(j);
        }
        for(int i=0;i<s;i++)
        {
            if(min<input.get(i))
            {
                s = i;
                break;
            }
        }

        for(int i=input.size()-1;i>e;i--)
        {
            if(max>input.get(i))
            {
                e = i;
                break;
            }
        }

        if(s==0&&e==0){
            result.add(-1);
        } else {
            result.add(s);
            result.add(e);
        }
        return result;
    }
}
