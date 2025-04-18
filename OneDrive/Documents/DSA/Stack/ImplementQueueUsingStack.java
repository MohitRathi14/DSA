import java.util.Stack;
class QueueTOStack {
    Stack<Integer> stack1;
    Stack<Integer> stack2;

    public QueueTOStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enQueue(int x) {
        stack1.push(x);
    }

    public int deQueue() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
            if (stack1.isEmpty()) {
                System.out.println("Stack is empty");
                return -1;
            }

        }
        return stack2.pop();
    }

    public int peek() {
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.peek();
    }

    public boolean empty() {
        return stack1.isEmpty() && stack2.isEmpty();
    }
    public void traverse() {
        if (empty()){
            System.out.println("Queue is empty");
        }
        else{
            if (stack2.isEmpty()) {
                for (Integer integer : stack1) {
                    System.out.print(integer + "\t");
                }
            }
            else {
                for (int i=stack2.size()-1; i>=0; i--) {
                    System.out.print(stack2.get(i) + "\t");
                }
                if (!stack1.isEmpty()) {
                    for (Integer integer : stack1) {
                        System.out.print(integer + "\t");
                    }
                }
            }
        }
    }
}
public class ImplementQueueUsingStack {
    public static void main(String[] args) {
        QueueTOStack queue = new QueueTOStack();
        queue.enQueue(1);
        queue.enQueue(2);
        queue.enQueue(3);

        System.out.println("Front element is: " + queue.peek());
        System.out.println("Dequeued element is: " + queue.deQueue());
        queue.enQueue(7);
        System.out.println("Front element is: " + queue.peek());
        System.out.println("Is queue empty? " + queue.empty());
        System.out.print("Print queue  ");
        queue.traverse();
    }
}
