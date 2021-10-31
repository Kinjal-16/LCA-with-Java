import java.util.*;
public class LCA {


    public static int lca(Node temp,int x1, int x2)
    {


        if(x1>temp.data && x2>temp.data)
            return lca(temp.right,x1,x2);
        else if(x1<temp.data && x2<temp.data)
            return lca(temp.left,x1,x2);
        else
            return temp.data;


    }


    public int[] checkDAGLCA(int i, int i1) {
        int [] LCA= new int[10];
        return LCA;

    }
}



