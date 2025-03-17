# Insert Element at Bottom of a Stack in Java

This program demonstrates how to insert an element into the bottom of a Java stack using recursion. The provided method preserves the original order of the stack elements while inserting the specified element at the bottom.

---

## Code:

```java
import java.util.*;
class MyStackInsertAtBottom {
    // Inserts an integer at the bottom of the stack
    public void insertAtBottom(Stack<Integer> s1, int x) {
        // Base condition: if the stack is empty, push the new element
        if (s1.empty()) {
            s1.push(x);
            return;
        }

        // Recursive step: remove the top element
        int top = (int) s1.peek();
        s1.pop();

        // Make a recursive call to move towards the bottom
        insertAtBottom(s1, x);

        // After inserting the new element, push the saved top element back
        s1.push(top);
    }

    // Demonstrates inserting an element at the bottom of a sample stack
    public void addElement() {
        // Create a stack and populate it with integers
        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(78);
        s1.push(45);
        s1.push(65);
        s1.push(67);

        // Print the original stack
        System.out.println(s1); // Output: [78, 45, 65, 67]

        // Insert the element 100 at the bottom of the stack
        insertAtBottom(s1, 100);

        // Print confirmation and the modified stack
        System.out.println("Work Done");
        System.out.println(s1); // Output: [100, 78, 45, 65, 67]
    }
}

// Main class to demonstrate functionality
public class InsertElementBottom {
    public static void main(String[] args) {
        // Create an object of MyStackInsertAtBottom and call the demo method
        MyStackInsertAtBottom obj = new MyStackInsertAtBottom();
        obj.addElement();
    }
}
```

---

## Explanation:

### Objective:
The goal of this program is to add an element to the bottom of a stack without using any additional data structures. It is achieved by applying **recursion** to temporarily remove elements from the stack, insert the new element at the bottom, and finally re-add the previously removed elements to maintain the original order.

---

### Step-by-Step Code Explanation:

#### `insertAtBottom` Method:

- **Purpose:** Inserts a given integer `x` at the bottom of the stack `s1`.
- **Logic:**
    1. If the stack is empty, directly push `x` into the stack (base condition).
    2. Otherwise:
        - Save the `top` element of the stack using `peek()` and remove it using `pop()`.
        - Make a recursive call to insert the element `x` into the smaller stack (stack without the top element).
        - Once the recursion completes (after `x` is inserted at the bottom), push the previously removed `top` element back into the stack.

- **Key Concept:** Recursion is used to backtrack through the stack, inserting the element at the bottom, and then restoring the removed elements in their original order.

#### `addElement` Method:

- **Purpose:** Demonstrates the functionality of `insertAtBottom` by:
    1. Creating and populating a stack: `[78, 45, 65, 67]`.
    2. Printing the initial contents of the stack.
    3. Calling `insertAtBottom` to add the integer `100` to the bottom.
    4. Printing the modified stack after the insertion.

#### `main` Method:

- **Purpose:** Creates an instance of the class `MyStackInsertAtBottom` and calls the `addElement` method to execute the demonstration.

---

## Example Workflow:

Let’s manually trace the execution of `insertAtBottom` when `100` is inserted into the stack `[78, 45, 65, 67]`.

1. **Initial Stack State:** `[78, 45, 65, 67]`.
2. `insertAtBottom(stack, 100)`:
    - Save `67`, recursive call for `[78, 45, 65]`.
3. Recursive call:
    - Save `65`, recursive call for `[78, 45]`.
4. Recursive call:
    - Save `45`, recursive call for `[78]`.
5. Recursive call:
    - Save `78`, recursive call for `[]` (empty stack).
6. Push `100` into the now-empty stack: `[100]`.
7. Backtrack:
    - Push `78` back: `[100, 78]`.
    - Push `45` back: `[100, 78, 45]`.
    - Push `65` back: `[100, 78, 45, 65]`.
    - Push `67` back: `[100, 78, 45, 65, 67]`.

---

## Execution Output:

When the program runs, the output will be:

[78, 45, 65, 67] 
Work Done
[100, 78, 45, 65, 67]


---

### Key Concepts Used:

1. **Stack Operations:**
    - `push`: Adds an element to the top of the stack.
    - `pop`: Removes the top element from the stack.
    - `peek`: Retrieves the top element without removing it.
2. **Recursion:**
    - Temporarily removes stack elements until the stack is empty.
    - Inserts the new element at the bottom.
    - Restores the removed elements in their original order.

3. **Order Preservation:** The method ensures that all elements above the bottom stay in their original relative positions.

---

## Use Cases:

- Adding an element to the bottom of a stack where direct access to the bottom is not allowed.
- Useful in stack-based algorithms where a modification of the stack's order is needed without violating its **Last-In-First-Out (LIFO)** property.