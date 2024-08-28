import java.util.*;
public class Stack{
    private int[] stack;
    private int top;
    private int size;
    public Stack(int size){
        this.size = size;
        stack = new int[size];
        top = -1;
    }
    public void push(int data){
        if(top==size-1){
            System.out.println("Stack is full");
        }
        else{
            stack[++top] =  data;
        }
    }
    public int pop(){
        if(top==-1)
            return -1;
        else{
            return stack[top--];
        }

    }
    public int peek(){
        if(top==-1)
            return -1;
        else{
            return stack[top];
        }
    }
    public static void main(String[] args){
        int size;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the stack: ");
        size = sc.nextInt();
        Stack s = new Stack(size);
        while(true){
            System.out.println("1. Push \n 2. Pop \n 3. Peek \n 4. Exit");
            System.out.println("Enter your choice: ");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                    System.out.println("Enter the element: ");
                    int data =sc.nextInt();
                    s.push(data);
                    break;
                case 2:
                    int elem = s.pop();
                    if(elem!=-1)
                        System.out.println("Popped element is: "+s.pop());
                    else
                        System.out.println("The stack is empty");
                 
                    break;
                case 3:
                    int ele = s.peek();
                    if(ele!=-1)
                        System.out.println("The top element is : "+s.peek());
                    else
                        System.out.println("The stack is empty");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Enter valid choice");
            }
        }
    }
}