/* FILE DESCRIPTION
 * Main Class to test DataStructure Classes
 * To Use DataStructure Copy Package named 'DataStructure' to your Porject
 * This Class is only used for testing DataStructures, its not part of the actual package
 */
/*
 * @Full Control    Wizer, D3Ad_ZeRo , Akshay
 * @date Created    17-11-2014
 * @IDE used        NetBeans IDE 8.0.1
 */
package test_DataStructure;


import DataStructure.*;             // DataStructure Package import

public class MainClass {
    
    void testLinkList()             // Function to test DataStructure.LinkList
    {
        System.out.println();
        System.out.println("Testing DataStructure.LinkList");
        LinkList l1 = new LinkList();
        l1.push_back(60,40,50,70,80,90,30,50,"Vivek");
        l1.show();
        l1.push_front("STR",1,2,3,4);
        l1.show();
        Node temp = l1.root.next;
        l1.root.next = l1.root.next.next;
        l1.root.next.prev = l1.root;
        l1.show();     
    }
    
    void testBinarySearchTree()
    {
        System.out.println();       // Function to test DataStructure.BinarySearchTree
        System.out.println("Testing DataStructure.BinarySearchTree");
        BinarySearchTree t = new BinarySearchTree();
        t.insert(50,80,10,2,4,6,8,7);

        System.out.print("Inorder: ");
        t.showInOrder();
        System.out.println();
        System.out.print("Postorder: ");
        t.showPostOrder();
        System.out.println();
        System.out.print("Preorder: ");
        t.showPreOrder();
    }
    
    public static void main(String[] args)
    {
        /*Calling Test Functions to Test DataStructure Package */
        MainClass obj = new MainClass();    
        obj.testLinkList();
        obj.testBinarySearchTree();
    }
}
