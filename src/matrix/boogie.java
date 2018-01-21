package matrix;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Prasannakshi on 4/1/2017.
 */
public class boogie {
    static Set<String> result = new HashSet<String>();

    public static void main(String args[]){
        char[][] input = new char[][]{{'r','t','l'},{'w','e','o'},{'p','s','t'}};
        ArrayList<String> output = pickwords(input);
        for(String one:output){
            System.out.print(one);
        }
    }

    private static ArrayList<String> pickwords(char[][] input) {
        int m = input.length;
        int n = input[0].length;

        String first = "";

        if(input==null || m==0){
            return new ArrayList<>();
        }

        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
//                Trie trie = new Trie();
                boolean[][] visited = new boolean[m][n];
                getwords(input,visited,i,j,first);
            }
        }

        return new ArrayList<>(result);
    }

    private static void getwords(char[][] board,boolean[][] visited, int i, int j,String first) {
        int m=board.length;
        int n=board[0].length;

        if(i<0 || j<0||i>=m||j>=n){
            return;
        }

        if(visited[i][j]) {
            return;
        }

        String str = first + board[i][j];

//        trie.insert(str);

        result.add(str);
        visited[i][j] = true;
        getwords(board, visited, i-1, j,str);
        getwords(board, visited, i+1, j,str);
        getwords(board, visited, i, j-1,str);
        getwords(board, visited, i, j+1,str);
        getwords(board, visited, i-1, j-1,str);
        getwords(board, visited, i-1, j+1,str);
        getwords(board, visited, i+1, j-1,str);
        getwords(board, visited, i+1, j+1,str);
        visited[i][j] = false;
    }

    public static class Trie{
        public TrieNode root = new TrieNode();

        public void insert(String word) {
            TrieNode node = root;
            String thisitem = "";
            for(char c: word.toCharArray()){
                if(node.children[c-'a']==null){
                    node.children[c-'a']= new TrieNode();
                }
                thisitem += c;
                node = node.children[c-'a'];
            }
            node.item = thisitem;
            result.add(node.item);
        }

        private class TrieNode {
            public TrieNode[] children = new TrieNode[26];
            public String item = "";
        }
    }
}
