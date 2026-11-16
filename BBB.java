class Queue1 {
    int front, rear, max;
    int arr[];

    Queue1(int size) {
        front = -1;
        rear = -1;
        max = size;
        arr = new int[max];
    }

    void enqueue(int value) {
        if (rear == max - 1) {
            System.out.println("Queue Overflow!");
        } else {
            if (front == -1) front = 0;
            rear++;
            arr[rear] = value;
            System.out.println("Enqueue(" + value + ") -> " + value + " added");
        }
    }

    int dequeue() {
        if (front == -1) {
            System.out.println("Queue Underflow!");
            return -1;
        } else {
            int value = arr[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println("Dequeue() -> " + value + " removed");
            return value;
        }
    }

    void display() {
        if (front == -1) {
            System.out.println("Queue: [Empty]");
        } else {
            System.out.print("Queue: [ ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("]  Front = " + arr[front]);
        }
        System.out.println("-------------------------");
    }
}
public class BBB {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.display();

        q.enqueue(20);
        q.display();

        q.enqueue(30);
        q.display();

        q.dequeue();
        q.display();

        q.enqueue(40);
        q.display();

        q.dequeue();
        q.display();

        System.out.println("Final Contents: 30, 40");
        System.out.println("Front Element: 30");
    }
}
