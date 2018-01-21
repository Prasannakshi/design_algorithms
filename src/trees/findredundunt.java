package trees;

/**
 * Created by Prasannakshi on 12/27/2017.
 */
public class findredundunt {
    public static int[] findRedundantConnection(int[][] edges) {
        int[] parent = new int[2001];
        for (int i = 0; i < parent.length; i++) parent[i] = i;

        for (int[] edge: edges){
            int f = edge[0], t = edge[1];
            if (find(parent, f) == find(parent, t)) return edge;
            else parent[find(parent, f)] = find(parent, t);
        }

        return new int[2];
    }

    private static int find(int[] parent, int f) {
        if (f != parent[f]) {
            parent[f] = find(parent, parent[f]);
        }
        return parent[f];
    }
    public static void main(String args[]){
        int[][] edges = {{1,2}, {1,3}, {2,3}};
        int[] res = findRedundantConnection(edges);
    }
}
