import java.util.*;
public class Node{
    private Node next;
    private int data;
    public Node(int data , Node next){
        this.data = data;
        this.next = next;
    }
    public Node(int data){
        this.data = data;
        this.next = null;
    }
    public static void displayList(Node head){
        Node current = head;
        while(current != null){
            System.out.print(current.data+" ");
            current = current.next;
        }
        System.out.println();
    }
    public static boolean checkPalindrome(Node head){
        
        return true;
    }
    public static void printReverseLinkedList(Node temp){
        if(temp.next!=null)
            reverseLinkedList(temp.next);
        System.out.print(temp.data+" ");
        
    }
    public static Node reverseLinkedList(Node head){
        Node current = head;
        Node prev = null;
        Node next = null;
        while(current!=null){
            next = current.next;
            current.next = prev;
            prev= current;
            current = next;
        }
        head = prev;
        return head;
    }
    public static Node getMiddleNode(Node head){
        Node slow = head;
        Node fast = head;
        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;

    }



public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the number of elements in the linked list");
    int n = sc.nextInt();
    Node head = null;
    Node tail = null;
    for(int i = 0; i < n; i++){
        System.out.println("Enter the data for the node "+(i+1));
        int data = sc.nextInt();
        Node newNode = new Node(data);
        if(head == null){
            head = newNode;
            tail = head;
        }
        else{
            tail.next = newNode;
            tail = tail.next;
        }
    }
    displayList(head);
    head = reverseLinkedList(head);
    displayList(head);
    Node temp = getMiddleNode(head);
    System.out.println(temp.data);
}
}
