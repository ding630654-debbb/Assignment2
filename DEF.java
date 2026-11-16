class Stack1 {
    int top;
    int max = 100;
    int arr[];

    Stack1() {
        top = -1;
        arr = new int[max];
    }

    void push(int value) {
        if (top == max - 1) {
            System.out.println("Stack Overflow!");
        } else {
            top++;
            arr[top] = value;
            System.out.println("Push(" + value + ") -> " + value + " added");
        }
    }

    int pop() {
        if (top == -1) {
            System.out.println("Stack is Empty!");
            return -1;
        } else {
            int value = arr[top];
            top--;
            System.out.println("Pop() -> " + value + " removed");
            return value;
        }
    }

    void display() {
        if (top == -1) {
            System.out.println("Stack: [Empty]");
        } else {
            System.out.print("Stack: [ ");
            for (int i = 0; i <= top; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("]  Top = " + arr[top]);
        }
        System.out.println("-------------------------");
    }
}

public class DEF {
    public static void main(String[] args) {
        Stack s = new Stack();

        s.push(10);
        s.display();

        s.push(20);
        s.display();

        s.push(30);
        s.display();

        s.pop();
        s.display();

        s.push(40);
        s.display();

        s.pop();
        s.display();

        System.out.println("Final Contents: 10, 20");
        System.out.println("Top Element: 20");
    }
}

