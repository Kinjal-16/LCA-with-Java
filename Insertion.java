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
   /* static Node create(int x)
    {
        Node ob = new Node(x);
        return ob;
    }*/

}

public class Insertion
{
    Node root;
    Insertion()
    {
        root = null;
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
    static void inorder(Node temp)
    {
        if (temp == null)
            return;
 
        inorder(temp.left);
        System.out.print(temp.data + " ");
        inorder(temp.right);
    }



    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1. New number \n 2. Exit \n Enter 1 or 2");
        int n= sc.nextInt();
        if(n==1)
        {
            System.out.println("Enter a number");
            int a = sc.nextInt();
            Node temp = new Node(a);
            Insertion ob = new Insertion();
            ob.insert(temp);
            
        }
        else 
            System.exit(0);

    }


}
