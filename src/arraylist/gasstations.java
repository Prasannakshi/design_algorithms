import java.util.ArrayList;

/**
 * Created by Prasannakshi on 11/25/2016.
 */
public class gasstations {
    public static void main(String[] args) {
        int G[] = {12,14,21,14,17,22,11,16,17,12,30,25,27,24,22,15,24,23,15,21};
        int D[] = {31,42,31,33,12,34,55,25,34,64,24,13,52,33,23,64,43,25,15};
        int len = G.length;
        System.out.println("No of Days:"+len);
        System.out.println("\nGas stations to be used:  "+GS(G,D));

    }

    private static ArrayList<Integer> GS(int[] g, int[] d) {
        int m = 170;
        int dis = 0;
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i=0;i<g.length;i++){
            if(i==0){
                arr.add(i,0);
            }
            if(i==1){
                arr.add(i,g[i]*d[i-1]);
                dis += d[i-1];
            }
            if(i>=2){
                    dis += d[i-1];
                    if(dis<m) {
                        arr.add(i, Math.min(arr.get(i - 1) + g[i] * d[i - 1], g[i] * dis));
                    }
                    else{
                        dis = d[i-1];
                        arr.add(i, Math.min(arr.get(i - 1) + g[i] * d[i - 1], g[i] * dis));
                    }
            }
        }
        return arr;
    }
}
