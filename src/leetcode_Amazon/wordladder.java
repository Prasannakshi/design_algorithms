package leetcode_Amazon;

import java.util.*;

/**
 * Created by Prasannakshi on 5/5/2017.
 */
public class wordladder {
    public static void main(String args[]){
        String input = "hit";
        String output = "cog";
        List<String> dict = new ArrayList<>();
        dict.add("hot");
        dict.add("dot");
        dict.add("dog");
        dict.add("lot");
        dict.add("log");
        dict.add("cog");
        List<List<String>> result = findLadders(input,output,dict);
    }
    static List<List<String>> result;
    static Map<String, List<String>> map;
    public static List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
        Queue<String> queue= new ArrayDeque<String>();
        map = new HashMap<String, List<String>>();
        Map<String, Integer> ladder = new HashMap<String, Integer>();
        int min = Integer.MAX_VALUE;
        for (String each: wordList){
            ladder.put(each, Integer.MAX_VALUE);
        }
        // ladder.put(endWord, Integer.MAX_VALUE);
        ladder.put(beginWord, 0);
        queue.add(beginWord);
        wordList.add(endWord);
        while(!queue.isEmpty()){
            String word = queue.poll();
            int step = ladder.get(word)+1;
            if(step>min){break;}
            for(int i=0;i<word.length();i++){
                char[] replace = word.toCharArray();
                for(char c='a';c<='z';c++){
                    replace[i] = c;
                    String newword = new String(replace);
                    if(ladder.containsKey(newword)){

                        if(step>ladder.get(newword)){
                            continue;
                        } else if (step<ladder.get(newword)){
                            queue.add(newword);
                            ladder.put(newword, step);
                        } else;

                        if(map.containsKey(newword)){
                            map.get(newword).add(word);
                        } else {
                            List<String> temp = new ArrayList<String>();
                            temp.add(word);
                            map.put(newword, temp);
                        }

                        if(newword==endWord){
                            min = step;
                        }
                    }
                }
            }
        }
        result = new ArrayList<List<String>>();
        backtrack(new ArrayList<String>(), endWord, beginWord);
        return result;
    }
    private static void backtrack(List<String> list, String end, String begin){
        if(end.equals(begin)){
            list.add(0,begin);
            result.add(new ArrayList<String>(list));
            list.remove(0);
            return;
        }
        list.add(0,end);
        if(map.containsKey(end)){
            for(String each: map.get(end)){
                backtrack(list, each, begin);
            }
        }
        list.remove(0);
    }
}
