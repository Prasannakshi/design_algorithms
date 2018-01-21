package stringsnarrays;

/**
 * Created by Prasannakshi on 11/28/2017.
 */
public class repeatedstring{
    public static int repeatedStringMatch(String A, String B) {
        StringBuilder sb = new StringBuilder();
        sb.append(A);
        int count = 1;
        while(sb.indexOf(B)<0){
            if(sb.length()-A.length()>B.length()){
                return -1;
            }
            sb.append(A);
            count++;
        }

        return count;
    }
    public static void main(String args[]){
        int result = repeatedStringMatch("abcd","cdabcdabcd");
    }
    }
