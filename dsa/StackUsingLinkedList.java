import java.util.*;
public class StackUsingLinkedList{
    Node top;
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
            this.next = null;
        }
    }
    public void push(int data){
        Node newNode = new Node(data);
        if(top==null)
            top = newNode;
            else{
                newNode.next = top;
                top = newNode;
            }
    }
    public int pop(){
        if(top==null)
            return -1;
        else{
            int data = top.data;
            top = top.next; 
            return data;
        }
    }
    public int peek(){
        if(top == null)
            return -1;
        else{
            return top.data;
        }
    }
    public static void main(String[] args){
        StackUsingLinkedList s = new StackUsingLinkedList();
        while(true){
            System.out.println("1. Pop \n 2.Push \n 3. Peek \n 4. Exit");
            System.out.println("Enter your choice: ");
            Scanner sc = new Scanner(System.in);
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    int elem = s.pop();
                    if(elem!=-1){
                        System.out.println("Popped element is: "+elem);
                    }
                    else    
                        System.out.println("The stack is empty");
                    break;
                case 2:
                    int data;
                    System.out.println("Enter the data to be pushed: ");
                    data = sc.nextInt();
                    s.push(data);
                    break;
                case 3:
                    int elm = s.peek();
                    if(elm!=-1)
                        System.out.println("The top element is : "+elm);
                    else
                        System.out.println("The stack is empty");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please enter valid choice");
            }
        }
    }
}