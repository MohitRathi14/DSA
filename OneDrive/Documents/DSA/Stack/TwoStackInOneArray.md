# Two Stacks in One Array

This project demonstrates how to implement two stacks within a single array in Java. This approach optimizes space usage by sharing the array between two stacks.

## Key Components

### Array Initialization
- The array `arr` is used to store elements of both stacks.
- `top1` and `top2` are pointers for the top elements of Stack 1 and Stack 2, respectively.

### Push Operations
- `push1(int x)`: Adds an element to Stack 1.
- Checks for overflow to ensure elements are not added beyond the array's capacity.

```java
public void push1(int x) {
    if (top1 < top2 - 1) {
        arr[++top1] = x;
    } else {
        System.out.println("Stack Overflow");
    }
}
        

```
example:
```java
TwoStacks ts = new TwoStacks(10);
ts.push1(5);// Adds 5 to Stack 1
```

- `push2(int x)`: Adds an element to Stack 2.
- Checks for overflow to ensure elements are not added beyond the array's capacity.
- Both methods check for overflow conditions to ensure elements are not added beyond the array's capacity.
```java
public void push2(int x) {
    if (top1 < top2 - 1) {
        arr[--top2] = x;
    } else {
        System.out.println("Stack Overflow");
    }
}
```
example:
```java
TwoStacks ts = new TwoStacks(10);
ts.push2(10); // Adds 10 to Stack 2
```

### Pop Operations
- `pop1()`: Removes and returns the top element from Stack 1.
- Checks for underflow to ensure elements are not removed from an empty stack.

```java
public int pop1() {
    if (top1 >= 0) {
        int x = arr[top1--];
        arr[top1 + 1] = 0; // Optional: Clear the popped element
        return x;
    } else {
        System.out.println("Stack Underflow");
        return -1;
    }
}
```
example:
```java
TwoStacks ts = new TwoStacks(10);
ts.push1(5);
int poppedElement = ts.pop1(); // Removes and returns 5 from Stack 1
```
- `pop2()`: Removes and returns the top element from Stack 2.
- Checks for underflow to ensure elements are not removed from an empty stack.

```java
public int pop2() {
    if (top2 < arr.length) {
        int x = arr[top2++];
        arr[top2 - 1] = 0; // Optional: Clear the popped element
        return x;
    } else {
        System.out.println("Stack Underflow");
        return -1;
    }
}
```
example:
```java
TwoStacks ts = new TwoStacks(10);
ts.push1(5);
int poppedElement = ts.pop1(); // Removes and returns 5 from Stack 1
```
- Both methods check for underflow conditions to ensure elements are not removed from an empty stack.

### Traverse Method
- `traverse()`: Prints the elements of both stacks for visualization.

```java
public void traverse() {
    System.out.println("Stack 1: ");
    for (int i = 0; i <= top1; i++) {
        System.out.print(arr[i] + " ");
    }
    System.out.println("Stack 2: ");
    for (int i = arr.length - 1; i >= top2; i--) {
        System.out.print(arr[i] + " ");
    }
    System.out.println();
}
```
example:
```java
TwoStacks ts = new TwoStacks(10);
ts.push1(5);
ts.push2(10);
ts.traverse(); // Prints elements of both stacks
```
### Main Method
- Demonstrates the usage of the `TwoStacks` class by performing push and pop operations and printing the array state.

## Usage

To use this implementation, compile and run the `TwoStackInOneArray` class. The main method demonstrates basic operations on the two stacks.

```java
public class TwoStackInOneArray {
    public static void main(String[] args) {
        TwoStacks ts = new TwoStacks(10);
        ts.push1(5);
        ts.push2(10);
        ts.push1(15);
        ts.push2(20);
        System.out.println("Array state: " + Arrays.toString(ts.getArr()));

        System.out.println("Popped element from stack1 is: " + ts.pop1());
        System.out.println("Popped element from stack2 is: " + ts.pop2());
        System.out.println("Array state: " + Arrays.toString(ts.getArr()));
    }
}
```
