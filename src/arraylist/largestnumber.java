import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by Prasannakshi on 2/28/2017.
 */
public class largestnumber {
    public static void main(String args[]){
        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(32, 30, 3, 5, 8, 0));
        System.out.print(findlargest(input));
    }

    private static String findlargest(ArrayList<Integer> input) {
        String result;
        String[] inter = new String[input.size()];
        for(int i=0;i<input.size();i++){
            inter[i] = String.valueOf(input.get(i));
        }
        Arrays.sort(inter, new Comparator<String>(){
            public int compare(String a, String b){
                String c = b+a;
                return (b+a).compareTo(a+b);
            }
        });

        StringBuilder sb = new StringBuilder();
        for(String s: inter){
            sb.append(s);
        }

        while(sb.charAt(0)=='0'&&sb.length()>1)
            sb.deleteCharAt(0);

        result = String.valueOf(sb);

        return result;
    }
}
