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
    static Node root;

    Insertion() {
        root = null;
    }

    Node create(int n)
    {
        Scanner sc = new Scanner(System.in);
        Insertion ob = new Insertion();


        Node temp = new Node(n);

        ob.insert(temp);
        n = sc.nextInt();


        return root;

    }
    
    void insert(Node temp)
    {
        Node temp2=root;
        if(root == null)
        {
            root=temp;
            return;
        }
        Node temp3=null;

        while(temp2 != null)
        {
            temp3=temp2;
            if(temp.data<temp2.data)
                temp2=temp2.left;
            else
            temp2=temp2.right;
        }
        if(temp3.data> temp.data)
             temp3.left=temp;
        else
            temp3.right=temp;



    }

    
}
