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
    static int checkLCA(int x1,int x2)
    {



        LCA ob2 = new LCA();
        Insertion ob = new Insertion();
        int a[]={15,10,25,8,12,20,30,6,9,18,22};
        int len = a.length;
        for(int i=0;i<len;i++) {
            ob.create(a[i]);

        }
        return(ob2.lca(ob.root,x1,x2));


    }

}



