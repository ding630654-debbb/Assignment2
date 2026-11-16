class Queue {
    int front, rear, max;
    int arr[];

    Queue(int size) {
        front = -1;
        rear = -1;
        max = size;
        arr = new int[max];
    }

    boolean isEmpty() {
        return front == -1;
    }

    boolean isFull() {
        return rear == max - 1;
    }

    void enqueue(int value) {
        if (isFull()) {
            System.out.println("Queue Overflow! Cannot insert " + value);
        } else {
            if (front == -1) {
                front = 0;
            }
            rear++;
            arr[rear] = value;
            System.out.println(value + " enqueued into Queue");
        }
    }

    int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue Underflow! Cannot dequeue, Queue is Empty");
            return -1;
        } else {
            int value = arr[front];
            if (front == rear) {
                front = -1;
                rear = -1;
            } else {
                front++;
            }
            System.out.println(value + " dequeued from Queue");
            return value;
        }
    }

    int frontElement() {
        if (isEmpty()) {
            System.out.println("Queue is Empty! No Front element");
            return -1;
        } else {
            return arr[front];
        }
    }

    void display() {
        if (isEmpty()) {
            System.out.println("Queue is Empty!");
        } else {
            System.out.print("Queue: [ ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println("]");
        }
    }
}

public class GHI {
    public static void main(String[] args) {
        Queue q = new Queue(5);

        q.enqueue(10);
        q.enqueue(20);
        q.enqueue(30);
        q.display();

        System.out.println("Front element: " + q.frontElement());

        q.dequeue();
        q.display();

        q.enqueue(40);
        q.enqueue(50);
        q.enqueue(60);
        q.display();

        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.dequeue();
        q.display();
    }
}

