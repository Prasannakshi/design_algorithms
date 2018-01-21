package matrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * Created by Prasannakshi on 3/31/2017.
 */
public class wordsearch {
    static Set<String> result = new HashSet<String>();

    public static void main(String args[]){
        char[][] input = new char[][]{{'r','t','l'},{'e','s','o'},{'p','s','t'}};
        String[] words = {"rest"};
        List<String> output = existword(input,words);
        for(String i:output){
            System.out.println(i);
        }
    }

    private static List<String> existtrie(char[][] board, String[] words) {


        Trie trie = new Trie();
        for(String word: words){
            trie.insert(word);
        }

        int m=board.length;
        int n=board[0].length;

        boolean[][] visited = new boolean[m][n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                dfs(board, visited, "", i, j, trie);
            }
        }

        return new ArrayList<String>(result);
    }

    private static void dfs(char[][] board, boolean[][] visited, String str, int i, int j, Trie trie) {
        int m=board.length;
        int n=board[0].length;

        if(i<0 || j<0||i>=m||j>=n){
            return;
        }

        if(visited[i][j])
            return;

        str = str + board[i][j];

        if(!trie.startsWith(str))
            return;

        if(trie.search(str)){
            result.add(str);
        }

        visited[i][j]=true;
        dfs(board, visited, str, i-1, j, trie);
        dfs(board, visited, str, i+1, j, trie);
        dfs(board, visited, str, i, j-1, trie);
        dfs(board, visited, str, i, j+1, trie);
        visited[i][j]=false;
    }

    public static ArrayList<String> existword(char[][] board, String[] words) {
        int m = board.length;
        int n = board[0].length;

        ArrayList<String> result = new ArrayList<>();


        for(String word:words) {
            boolean temp = false;
            for (int i = 0; i < m; i++) {
                for (int j = 0; j < n; j++) {
                    boolean[][] visited = new boolean[m][n];
                    if (dfss(board, visited, word, i, j, 0)) {
                        temp = true;
                    }
                }
            }
            if(temp==true){
                result.add(word);
            }
        }
        return result;
    }

    public static boolean dfss(char[][] board, boolean[][] visited,String word, int i, int j, int k){
        int m = board.length;
        int n = board[0].length;

        if(i<0 || j<0 || i>=m || j>=n){
            return false;
        }

        if(visited[j][j]==true){
            return false;
        }

        if(board[i][j] == word.charAt(k)){
            char temp = board[i][j];
            if(k==word.length()-1){
                return true;
            }else if(dfss(board,visited, word, i-1, j, k+1)
                    ||dfss(board, visited,word, i+1, j, k+1)
                    ||dfss(board, visited,word, i, j-1, k+1)
                    ||dfss(board, visited,word, i, j+1, k+1)){
                return true;
            }
            board[i][j]=temp;
        }

        return false;
    }

    static class Trie{
        public TrieNode root = new TrieNode();

        public void insert(String word){
            TrieNode node = root;
            for(char c: word.toCharArray()){
                if(node.children[c-'a']==null){
                    node.children[c-'a']= new TrieNode();
                }
                node = node.children[c-'a'];
            }
            node.item = word;
        }

        public boolean search(String word){
            TrieNode node = root;
            for(char c: word.toCharArray()){
                if(node.children[c-'a']==null)
                    return false;
                node = node.children[c-'a'];
            }
            if(node.item.equals(word)){
                return true;
            }else{
                return false;
            }
        }

        public boolean startsWith(String prefix){
            TrieNode node = root;
            for(char c: prefix.toCharArray()){
                if(node.children[c-'a']==null)
                    return false;
                node = node.children[c-'a'];
            }
            return true;
        }

        private class TrieNode {
            public TrieNode[] children = new TrieNode[26];
            public String item = "";
        }
    }
}
