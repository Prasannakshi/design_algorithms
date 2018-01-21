package dynammicprogramming;

import java.util.*;

/**
 * Created by Prasannakshi on 11/9/2017.
 */
public class wordbreak {
    public static List<String> wordBreak(String s, Set<String> wordDict) {
        return DFS(s, wordDict, new HashMap<String, LinkedList<String>>());
    }

    // DFS function returns an array including all substrings derived from s.
    static List<String> DFS(String s, Set<String> wordDict, HashMap<String, LinkedList<String>> map) {
        if (map.containsKey(s))
            return map.get(s);

        LinkedList<String>res = new LinkedList<String>();
        if (s.length() == 0) {
            res.add("");
            return res;
        }
        for (String word : wordDict) {
            if (s.startsWith(word)) {
                List<String>sublist = DFS(s.substring(word.length()), wordDict, map);
                for (String sub : sublist)
                    res.add(word + (sub.isEmpty() ? "" : " ") + sub);
            }
        }
        map.put(s, res);
        return res;
    }
    public static void main(String args[]){
        Set<String> worddict = new HashSet<>(Arrays.asList("cat", "cats", "and", "sand", "dog"));
        List<String> result = wordBreak("catsanddog",worddict);
    }
}
