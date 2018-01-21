package arraylist;

/**
 * Created by Prasannakshi on 4/9/2017.
 */
public class hindex {
    public static void main(String args[]){
        int[] citations = {0,4,7,8,3,2,9,14};
        System.out.print(index(citations));
    }

    private static int index(int[] citations) {
//        Arrays.sort(citations);

        int result = 0;
        for(int i=0; i<citations.length; i++){
            int smaller = Math.min(citations[i], citations.length-i);
            result = Math.max(result, smaller);
        }

        return result;
    }
}
