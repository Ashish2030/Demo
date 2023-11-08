import java.io.*;
import java.lang.*;


class Node 
{
    int data;
    Node left;
    Node right;
    Node(int data)
    {
        this.data=data;
    }
}
class height 
{
    Node root;
    public int maxHeight(Node root)
    {
        if(root == null )
        {
            return 0;
        }
        int leftHeight = maxHeight(root.left);
        int rightHeight = maxHeight(root.right);
        if(leftHeight > rightHeight)
        {
          return leftHeight + 1;  
        }
        else
        {
           return rightHeight + 1; 
        }
    }
    
    public static void main(String args[])
    {
      height obj =new height();
      obj.root=new Node(1);
      obj.root.left = new Node(2);
      obj.root.right= new Node(3);
      obj.root.left.left=new Node(4);
      obj.root.left.right=new Node(5);
      int height = obj.maxHeight(obj.root);// height
      System.out.println("Height of this tree is "+ height);
    }
}