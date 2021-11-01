import java.util.*;
public class LCA {
    Insertion ob;

    public static int lca(Node temp, int x1, int x2) {


        if (x1 > temp.data && x2 > temp.data)
            return lca(temp.right, x1, x2);
        else if (x1 < temp.data && x2 < temp.data)
            return lca(temp.left, x1, x2);
        else
            return temp.data;


    }


    public ArrayList<Integer> newLCA(Insertion ob, int v1, int v2) {
        this.ob = ob;
        ArrayList<Integer> LCA = new ArrayList<>();
        Queue<Integer> level = new LinkedList<>();
        Queue<Integer> nextLevel = new LinkedList<>();
        if (v1 == v2) {
            LCA.add(v1);
            return LCA;
        }
        boolean[] Parents1 = new boolean[ob.adj.length];
        Arrays.fill(Parents1, false);
        ArrayList<Integer>[] Ancestors = rev(ob.adj);


        Parents1[v1] = true;
        for (int i = 0; i < Ancestors[v1].size(); i++) {
            int x = Ancestors[v1].get(i);
            findParents(Ancestors, Parents1, x);
        }
        for (int i = 0; i < Ancestors[v2].size(); i++) {
            int x = Ancestors[v2].get(i);
            level.add(x);
        }

        while (!level.isEmpty()) {
            int vertices = level.remove();
            if (Parents1[vertices]) {
                LCA.add(vertices);
            }
            if (LCA.isEmpty()) {
                for (int i = 0; i < Ancestors[vertices].size(); i++) {
                    int x = Ancestors[vertices].get(i);
                    nextLevel.add(x);
                }
            }
            level = nextLevel;
            nextLevel = new LinkedList<>();
        }

        return LCA;
    }

    public ArrayList<Integer>[] rev(ArrayList<Integer>[] adj) {
        ArrayList<Integer>[] reverse = (ArrayList<Integer>[]) new ArrayList[adj.length];
        for (int i = 0; i < reverse.length; i++) {
            reverse[i] = new ArrayList<>();
        }
        for (int i = 0; i < adj.length; i++) {
            for (int j = 0; j < adj[i].size(); j++) {
                int w = adj[i].get(j);
                ob.addEdge(reverse, w, i);
            }
        }
        return reverse;
    }

    public void findParents(ArrayList<Integer>[] parentTable, boolean[] Parents1, int vertices) {
        Parents1[vertices] = true;
        for (int i = 0; i < parentTable[vertices].size(); i++) {
            int x = parentTable[vertices].get(i);
            findParents(parentTable, Parents1, x);
        }
    }
}



