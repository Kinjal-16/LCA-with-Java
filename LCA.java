import java.util.*;
public class LCA {
    
    public static int lca(Node temp, int x1, int x2)
    {
        if(x1>temp.data && x2>temp.data)
            return lca(temp.right,x1,x2);
        else if(x1<temp.data && x2<temp.data)
            return lca(temp.left,x1,x2);
        else 
         return temp.data;
        
    
    }
   /* public static void main(String args[])
    {
        Node root=null;
        Scanner sc= new Scanner(System.in);
        Insertion ob = new Insertion();
        root=ob.create();
        System.out.println("Enter 2 nos to compute LCA");
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println("LCA :"+lca(root,a,b));

    }*/

}
