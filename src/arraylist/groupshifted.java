package arraylist;

import java.util.*;

/**
 * Created by Prasannakshi on 4/16/2017.
 */
public class groupshifted {
    public static void main(String args[]){
        String[] input = {"abc", "bcd", "acef", "psv", "az", "ba", "a", "z"};
        List<List<String>> output = groupStrings(input);
    }

    private static List<List<String>> groupStrings(String[] strings) {
        List<List<String>> result = new ArrayList<List<String>>();
        HashMap<String, ArrayList<String>> map
                = new HashMap<String, ArrayList<String>>();

        for(String s: strings){
            char[] arr = s.toCharArray();
            if(arr.length>0){
                int diff = arr[0]-'a';
                for(int i=0; i<arr.length; i++){
                    System.out.print(arr[i]);
                    System.out.print(arr[i]-diff);
                    if(arr[i]-diff<'a'){
                        arr[i] = (char) (arr[i]-diff+26);
                        System.out.print(arr[i]);
                    }else{
                        arr[i] = (char) (arr[i]-diff);
                        System.out.print(arr[i]);
                    }

                }
            }

            String ns = new String(arr);
            if(map.containsKey(ns)){
                map.get(ns).add(s);
            }else{
                ArrayList<String> al = new ArrayList<String>();
                al.add(s);
                map.put(ns, al);
            }
        }

        for(Map.Entry<String, ArrayList<String>> entry: map.entrySet()){
            Collections.sort(entry.getValue());
        }

        result.addAll(map.values());

        return result;
    }
}
