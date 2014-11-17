/*
 * @Full Control    Wizer, D3Ad_ZeRo , Akshay
 * @date Created    17-11-2014
 * @IDE used        NetBeans IDE 8.0.1
 */
package DataStructure;

public class LinkList
{
    public Node root; 
    public Node last;
    public LinkList()
    {
        root = null;
        last = null;
    }
    
    public LinkList(int... values)
    {
        root = null;
        last = null;
        for(int val:values)
        {
            push_back(val);
        }
    }
    final public void push_back(int... values)
    {
        for(int val:values)
        {
            if(root == null && last == null)
            {
                root=last= new Node();
                root.value = val;
                root.next = null;
                root.prev = null;
            }
            else
            {
                last.next = new Node();
                last.next.value = val;
                last.next.prev = last;
                last.next.next = null;
                last = last.next;
            }
        }
    }
    
    public void push_front(int... values)
    {
         for(int val:values)
         {
             if(root == null && last == null)
            {
                root=last= new Node();
                root.value = val;
                root.next = null;
                root.prev = null;
            }
            else
            {
          
                root.prev = new Node();
                root.prev.value = val;
                root.prev.next = root;
                root.prev.prev = null;
                root=root.prev;      
            }
         }
    }
    
    public void show()
    {
        Node p = root;
        while(p!=null)
        {
            System.out.print(p.value+", ");
            p=p.next;
        }
        System.out.println();
    }
}

