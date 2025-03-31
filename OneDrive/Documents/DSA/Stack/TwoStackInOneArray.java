import java.util.Arrays;

class TwoStacks {
    private int[] arr;
    private int size;
    private int top1, top2;

    // Constructor
    public TwoStacks(int n) {
        size = n;
        arr = new int[n];
        top1 = -1;
        top2 = size;
    }
    //getter for the arr

    public int[] getArr() {
        return arr;
    }

    // Method to push an element to the first stack
    public void push1(int x) {
        if (top1 < top2 - 1) {
            arr[++top1] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Method to push an element to the second stack
    public void push2(int x) {
        if (top1 < top2 - 1) {
            arr[--top2] = x;
        } else {
            System.out.println("Stack Overflow");
        }
    }

    // Method to pop an element from the first stack
    public int pop1() {
        if (top1 >= 0) {
            int x = arr[top1--];
            arr[top1+1] = 0; // Optional: Clear the popped element
            return x;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }

    // Method to pop an element from the second stack
    public int pop2() {
        if (top2 < size) {
            int x = arr[top2++];
            arr[top2-1] = 0; // Optional: Clear the popped element
            return x;
        } else {
            System.out.println("Stack Underflow");
            return -1;
        }
    }
    public void traverse() {
        System.out.print("Stack1: ");
        for (int i = top1; i >= 0; i--) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Stack2: ");
        for (int i = top2; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
public class TwoStackInOneArray{

    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(10);
        ts.push1(5);
        ts.push2(10);
        ts.push1(15);
        ts.push2(20);
        System.out.println("Popped element from stack1 is: " + Arrays.toString(ts.getArr()));

        System.out.println("Popped element from stack1 is: " + ts.pop1());
        System.out.println("Popped element from stack2 is: " + ts.pop2());
        System.out.println("Popped element from stack1 is: " + Arrays.toString(ts.getArr()));


    }

}

