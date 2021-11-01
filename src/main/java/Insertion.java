import java.util.*;
class Node
{
    int data;
    Node left;
    Node right;
    Node(int x)
    {
        data=x;
        left = null;
        right=null;
    }


}


public class Insertion {
    Node root;
    protected ArrayList<Integer>[] adj;


    Insertion() {
    }



    Insertion(int V) {


        adj = (ArrayList<Integer>[]) new ArrayList[V];
        for (int v = 0; v < V; v++) {
            adj[v] = new ArrayList<Integer>();
        }

    }


    void create(int n) {


        Node temp = new Node(n);

        insert(temp);


    }

    void insert(Node temp) {
        Node temp2 = root;
        if (root == null) {
            root = temp;

            return;
        }
        Node temp3 = null;

        while (temp2 != null) {
            temp3 = temp2;
            if (temp.data < temp2.data)
                temp2 = temp2.left;
            else
                temp2 = temp2.right;
        }
        if (temp3.data > temp.data)
            temp3.left = temp;
        else
            temp3.right = temp;


    }


    public void addEdge(int v, int w) {

        if (v >= 0 && v < adj.length && w >= 0 && w < adj.length) {
            addEdge(adj, v, w);
        }
    }

    public void addEdge(ArrayList<Integer>[] adj, int v, int w) {
        ArrayList<Integer> list = adj[v];
        list.add(w);

    }

}





