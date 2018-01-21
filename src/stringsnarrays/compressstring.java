package stringsnarrays;

/**
 * Created by Prasannakshi on 12/4/2017.
 */
public class compressstring {
    public static int compress(char[] chars) {
        String result ="";
        char prev =  chars[0];
        int count = 1;
        for(int i=1;i<chars.length;i++){
            if(chars[i]!=prev){
                result = result + prev + count;
//                result.append(count.toString());
                count=0;
                prev = chars[i];
            }
            count++;
        }
        result = result + prev + count;
        return result.toString().length();
    }
    public static void main(String args[]){
        char[] input ={ 'a','a','b','b','c','c','c' };
        int res = compress(input);
    }
}
