package bfsdfsbbt;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Prasannakshi on 11/23/2017.
 */
public class removeinvalid {
    public static void main(String args[]){
        String input = "()())()";
        List<List<String>> result = formactual(input);
    }

    private static List<List<String>> formactual(String input) {
        List<String> out = new ArrayList<>();
        return dfsremoveinvalid(out,"",input,0,0);
    }

    private static List<List<String>> dfsremoveinvalid(List<String> out, String s, String input, int i, int i1) {
        return null;
    }

}
