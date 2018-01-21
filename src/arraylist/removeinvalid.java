package arraylist;

import java.util.ArrayList;

/**
 * Created by Prasannakshi on 4/2/2017.
 */
public class removeinvalid {
    static ArrayList<String> result = new ArrayList<String>();
    static int max=0;

    public static void main(String args[]){
        String input = "(a)())()";
        ArrayList<String> result = removeparent(input);
        for(String l:result){
            System.out.println(l);
        }
    }

    private static ArrayList<String> removeparent(String s) {
        if(s==null)
            return result;

        dfs(s, "", 0, 0);
        if(result.size()==0){
            result.add("");
        }

        return result;
    }

    private static void dfs(String left, String right, int countLeft, int maxLeft) {
        if(left.length()==0){
            if(countLeft==0 && right.length()!=0){
                if(maxLeft > max){
                    max = maxLeft;
                }

                if(maxLeft==max && !result.contains(right)){
                    result.add(right);
                }
            }

            return;
        }

        if(left.charAt(0)=='('){
            dfs(left.substring(1), right+"(", countLeft+1, maxLeft+1);//keep (
            dfs(left.substring(1), right, countLeft, maxLeft);//drop (
        }else if(left.charAt(0)==')'){
            if(countLeft>0){
                dfs(left.substring(1), right+")", countLeft-1, maxLeft);
            }
            dfs(left.substring(1), right, countLeft, maxLeft);

        }else{
            dfs(left.substring(1), right+String.valueOf(left.charAt(0)), countLeft, maxLeft);
        }
    }
}
