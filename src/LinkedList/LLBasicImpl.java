package LinkedList;


import java.util.Scanner;

class Node
{
    int data;
    Node next;
    Node(int x)
    {
        data = x;
//        next=null; // this is optional in java
    }
}
public class LLBasicImpl {
    public static void main(String[] args) {
        Node head = new Node(10);
        Node temp1 = new Node(20);
        Node temp2 = new Node(30);
        head.next = temp1;
        temp1.next = temp2;
//        head.next.next = temp2;
        System.out.println("Do you want to insert Element, If yes Press 1 and If you want to delete press 2 and 3 for recursive traversal");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int data;
        while (n>0)
        {
            switch (n){
                case 1: System.out.println("Enter the Element");
                    data = scanner.nextInt();
                    insert(data, head);
                    break;
                case 2: head = delete(head);
                        break;
                case 3: recTraversal(head);
                        break;
                default:traverse(head);
            }
            System.out.println("Do you want more operation, Press 1 for insertion, 2 for Deletion and " +
                    "3 for recursive traversal and any other +ve number for traversal");
            n = scanner.nextInt();
        }
    }
    static Node delete(Node head)
    {
        Node curr = head;
//        head.next = null;
        return curr.next;
    }
    static void insert(int data,Node head)
    {
        Node curr = head;
        while (curr.next != null)
        {
            curr = curr.next;
        }
        Node temp = new Node(data);
        curr.next = temp;
//        temp.data = data;
//        temp.next = null;
    }
    static void traverse(Node head)
    {
        Node curr = head;
        while (curr != null)
        {
            System.out.print(curr.data+" ");
            curr = curr.next;
        }
        System.out.println();
    }
    static void recTraversal(Node head)
    {
        if (head == null)
            return ;
        System.out.print(head.data+" ");
        recTraversal(head.next);
    }
}
