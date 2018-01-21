package arraylist;

/**
 * Created by Prasannakshi on 4/8/2017.
 */
public class oneedit {
    public static void main(String args[]){
        System.out.print(isoneedit("test","tes"));
    }

    private static boolean isoneedit(String s, String t) {
        if(s==null || t==null)
            return false;

        int m = s.length();
        int n = t.length();

        int x = Math.abs(m-n);
        if(x>1){
            return false;
        }

        int i=0;
        int j=0;
        int count=0;

        while(i<m&&j<n){
            if(s.charAt(i)==t.charAt(j)){
                i++;
                j++;
            }else{
                count++;
                if(count>1)
                    return false;

                if(m>n){
                    i++;
                }else if(m<n){
                    j++;
                }else{
                    i++;
                    j++;
                }
            }
        }

        if(i<m||j<n){
            count++;
        }

        if(count==1)
            return true;

        return false;
    }
}
