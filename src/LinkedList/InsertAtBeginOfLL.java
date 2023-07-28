package LinkedList;



public class InsertAtBeginOfLL {
    public static void main(String[] args) {
        Node head = null;
        head = insertBegin(head,10);
        head = insertBegin(head,20);
        head = insertBegin(head,30);
        head = insertBegin(head,40);
        traverse(head);
    }
    static Node insertBegin(Node head, int data)
    {
        Node curr = new Node(data);
        curr.next = head;
        return curr;
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
}
