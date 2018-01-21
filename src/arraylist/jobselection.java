import java.util.ArrayList;

/**
 * Created by Prasannakshi on 11/13/2016.
 */
public class jobselection {
    public static void main(String[] args) {
        int p[] = {5,9,12,7,5,13,7,5,4,9,8,7,5,8,4,3,5,10,4,6,8,12,5,6,3,7,16,2,2,16};
        int len = p.length;
        System.out.println("No of Days:"+len);
        System.out.println("\nDay with the payment:  "+JS(p));
    }

    private static ArrayList<Integer> JS(int[] p) {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i=0;i<=p.length-1;i++){
            if(i==0){
                result.add(i,p[0]);
            }
            if(i==1){
                result.add(i,p[0]+p[1]);
            }
            if(i==2){
                result.add(i, Math.max(0+ p[i] + p[i - 1], result.get(i - 1)));
            }
            if(i>2){
                result.add(i, Math.max(result.get(i - 3) + p[i] + p[i - 1], result.get(i - 1)));
            }
        }
        return result;
    }
}
