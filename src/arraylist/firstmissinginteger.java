package arraylist;

/**
 * Created by Prasannakshi on 3/14/2017.
 */
public class firstmissinginteger {
    public static void main(String args[]){
//        ArrayList<Integer> input = new ArrayList<>(Arrays.asList(3,0,1,3,4));
        int[] input = {3,0,1,3,4};
        System.out.print(findmissing(input));
    }

    private static int findmissing(int[] A) {
        int n = A.length;
        for (int i = 0; i < n; i++) {
            // when the ith element is not i
            while (A[i] != i) {
                // no need to swap when ith element is out of range [0,n]
                if (A[i] < 0 || A[i] >= n)
                    break;

                //handle duplicate elements
                if(A[i]==A[A[i]])
                    break;
                // swap elements
                int temp = A[i];
                A[i] = A[temp];
                A[temp] = temp;
            }
        }

        for (int i = 0; i < n; i++) {
            if (A[i] != i)
                return i;
        }

        return n;
//        int n = list.size();
//
//        for (int i = 0; i < n; i++) {
//            while ((int)list.get(i) != i + 1) {
//                if ((int)list.get(i) <= 0 || (int)list.get(i) >= n)
//                    break;
//
//                if((int)list.get(i)==(int)list.get((int)list.get(i)-1))
//                    break;
//
//                int temp = (int)list.get(i);
//                list.set(i,list.get(temp-1));
//                list.set(temp-1,temp);
//            }
//        }
//        for (int i = 0; i < n; i++){
//            if ((int)list.get(i) != i + 1){
//                return i + 1;
//            }
//        }
//        return n + 1;
    }
}
//int n = A.size() + 1;
//int count;
//    int idx = 0;
//    int size = A.size();
//	    count = size - 1;
//
//                for (idx = size - 1; idx >= 0; idx--) {
//
//                int num = A.get(idx);
//
//                if (num < 0) {
//        int val = A.get(count);
//        A.set(idx, val);
//        A.set(count, num);
//        count--;
//        }
//
//        }
//
//        for (idx = 0; idx <= count; idx++) {
//
//        int num = A.get(idx);
//
//        num = Math.abs(num);
//
//        if (num > 0 && num < n) {
//
//        int index = num - 1;
//        int val = A.get(index);
//        A.set(index, -val);
//
//        }
//
//        }
//
//        for (idx = 0; idx <= count; idx++) {
//
//        int num = A.get(idx);
//
//        if (num > 0) {
//        return idx + 1;
//        }
//
//        }
//
//        return idx + 1