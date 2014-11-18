
/*
 * @Full Control    Wizer, D3Ad_ZeRo , Akshay
 * @date Created    17-11-2014
 * @IDE used        NetBeans IDE 8.0.1
 */
 /*
  * Using treeNode instead of Generic Node, Since BST may not work.
*/
package DataStructure;

class treeNode
{
    public double value;
    treeNode next;
    treeNode prev;
}

public class BinarySearchTree {
    
    treeNode root;

    public BinarySearchTree() {
        root = null;
    } 
    public void insert(int... values)
    {
       for(int v:values)
       {
          push_value(root,v); 
       }
    }
    public void showInOrder()
    {
        inOrder(this.root);
        
    }
    public void showPreOrder()
    {
        preOrder(this.root);
    }
    public void showPostOrder()
    {
        postOrder(this.root);
    }
    private void push_value(treeNode p, int val)
    {
        if(root == null)
        {
            root = new treeNode();
            root.value = val;
            root.prev = null;
            root.next = null;
        }
        else
        {
            if(val >= p.value)
            {
                if(p.next == null)
                {
                    p.next = new treeNode();
                    p.next.value = val;
                    p.next.next = null;
                    p.next.prev = null;
                }
                else
                {
                    push_value(p.next, val);
                }
            }
            else
            {
                if(p.prev == null)
                {
                    p.prev = new treeNode();
                    p.prev.value = val;
                    p.prev.next = null;
                    p.prev.prev = null; 
                }
                else
                {
                    push_value(p.prev, val);
                }
            }
        }
    }
    void inOrder(treeNode p)
    {
        if(root == null)
        {
            System.out.println("Empty");
        }
        else if(p != null)
        {
            inOrder(p.prev);
            System.out.print(" "+p.value);
            inOrder(p.next);
        }
    }
    void preOrder(treeNode p)
    {
        if(root == null)
        {
            System.out.println("Empty");
        }
        else if(p != null)
        {
            System.out.print(" "+p.value);
            preOrder(p.prev);
            preOrder(p.next);
        }
    }
    void postOrder(treeNode p)
    {
        if(root == null)
        {
            System.out.println("Empty");
        }
        else if(p != null)
        {
            postOrder(p.prev);
            postOrder(p.next);
            System.out.print(" "+p.value);
        }
    }
    
}
