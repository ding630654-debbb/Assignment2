class Stack {
    int arr[];
    int size = 5;
    int top;

    Stack() {
        top = -1;
        arr = new int[size];
    }

    void push(int val) {
        if (top == size - 1) {
            System.out.println("stack overFlow can't push more");
        } else {
            top++;
            arr[top] = val;
            System.out.println(val + ": push into Stack");
        }
    }

    int pop() {
        if (top<=0) {
            System.out.println("Stack is underflow");
            return top - 1;
        } else {
            int value=arr[top];
            top--;
            return value;
        }
    }

    int peek() {
return arr[top];
    }
    void display(){
        if(top<=0){
            System.out.println("Stack is empty");
        }else {
            for(int i=top;i>=0;i--)
            System.out.println( "value :"+arr[i]);
        }
    }
}

public class Abc {
    public static void main(String[]args){
        Stack S=new Stack();
        S.push(23);
        S.push(54);
        S.push(23);
        S.push(65);
        S.push(87);
        S.display();
        System.out.println("Pop is: "+S.pop());
        System.out.println("Peek is: "+S.peek());
    }
}
