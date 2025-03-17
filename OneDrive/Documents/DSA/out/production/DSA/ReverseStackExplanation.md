# Explanation of the Reverse Stack Code

The provided code demonstrates how to reverse a stack using recursion. This documentation explains the functionality of the code step-by-step, including its flow, methods, and their respective purposes.

---

## **Objective**
The goal of this code is to reverse the elements in a stack using recursion.

---

## **Code Overview**
The code consists of the following:
1. A `Stack<Integer>` to hold the elements.
2. Methods to reverse the stack (`reverse`) and insert an element at the bottom of the stack (`insertAtBottom`).

---

## **Java Code**

```java
import java.util.Stack;

class MyStackReverse {
    public void addElement() {
        Stack<Integer> st = new Stack<Integer>();
        st.push(78);
        st.push(45);
        st.push(65);
        st.push(67);
        st.push(35);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }

    public void reverse(Stack<Integer> st) {
        if (st.empty()) {
            return;
        }
        int top = st.peek();
        st.pop();
        reverse(st);
        insertAtBottom(st, top);
    }

    public void insertAtBottom(Stack<Integer> st, int element) {
        if (st.empty()) {
            st.push(element);
            return;
        }
        int top = st.pop();
        insertAtBottom(st, element);
        st.push(top);
    }
}

public class ReverseStack {
    public static void main(String[] args) {
        MyStackReverse p = new MyStackReverse();
        p.addElement();
    }
}
```

---

## **How the Code Works**

### **1. addElement() Method**
- **Purpose:**
    - Creates a stack (`Stack<Integer>`) and adds the following elements: `78, 45, 65, 67, 35`.
    - Prints the stack before and after reversal.

- **Steps:**
    - The method initializes the stack and pushes elements into it.
    - The stack initially looks like this:
      ```
      [78, 45, 65, 67, 35]
      ```
      (Note: The top of the stack is on the right.)
    - Calls the `reverse()` method to reverse the stack.
    - Prints the reversed stack.

---

### **2. reverse() Method**
- **Purpose:**
    - Uses recursion to reverse the stack.

- **Steps:**
    1. **Base Case**:
        - If the stack is empty (`st.empty()`), the recursion terminates immediately (`return`).

    2. **Recursive Step**:
        - Fetch the topmost element using `st.peek()` and remove it using `st.pop()`.
        - Call the `reverse()` method recursively to reverse the remaining stack.

    3. **Reinsertion**:
        - Once all elements are removed (stack becomes empty), the recursion starts returning.
        - At each return stage, the removed element is inserted at the **bottom** of the stack using the `insertAtBottom()` method.

---

### **3. insertAtBottom() Method**
- **Purpose:**
    - Inserts an element at the bottom of the stack using recursion.

- **Steps:**
    1. If the stack is empty, the element is pushed directly to the stack's bottom.
    2. Otherwise:
        - Remove the top element using `pop()`.
        - Call `insertAtBottom()` recursively to insert the desired element into the rest of the stack.
        - After recursion, push the originally removed top element back onto the stack.

---

## **Execution Flow**

### Before Reversal (`addElement()`):
The stack is initially:
[78, 45, 65, 67, 35]
// Top of the stack is on the right


---

### During Reversal (`reverse()`):
1. Recursive calls remove elements:
   ```
   Removed 35 → [78, 45, 65, 67]
   Removed 67 → [78, 45, 65]
   Removed 65 → [78, 45]
   Removed 45 → [78]
   Removed 78 → []
   ```
2. The recursion starts reinserting elements at the bottom via `insertAtBottom()`.

---

### After Reversal:
The stack is now reversed:
[35, 67, 65, 45, 78]


---

## **Key Methods**

### reverse() Method
- **Purpose**: Reverses the stack by using recursion to empty it, and then reinserts elements using `insertAtBottom()`.
- **Process**:
    - Temporarily removes the top element.
    - Recursively reverses the rest of the stack.
    - Inserts the removed element at the bottom of the stack during the recursion's return phase.

### insertAtBottom() Method
- **Purpose**: Inserts a given element at the bottom of a stack.
- **Process**:
    - If the stack is empty, push the element.
    - Otherwise:
        - Remove the top element, insert the new element at the bottom, and then restore the top element.

---

## **Example of insertAtBottom()**
Suppose you want to insert `35` into the stack `[78, 45, 65]`:
1. `pop()` removes `65`.
2. Recursive call works on `[78, 45]`.
3. `pop()` removes `45`.
4. Recursive call works on `[78]`.
5. `pop()` removes `78`.
6. Recursive call works on the empty stack (`[]`), where `35` is pushed.
7. Returning:
    - Push `78` back → `[35, 78]`.
    - Push `45` back → `[35, 78, 45]`.
    - Push `65` back → `[35, 78, 45, 65]`.

---

## **Output**
The program outputs the stack before and after reversal:
```plaintext
[78, 45, 65, 67, 35]  // Original stack
[35, 67, 65, 45, 78]  // Reversed stack
```

---

## **Summary**
- **Objective**: Reverse a stack using recursion without any auxiliary data structures.
- **Methods Used**:
    1. `addElement()` adds elements and calls the reversal logic.
    2. `reverse()` manages the recursive removal and reordering.
    3. `insertAtBottom()` inserts each element at the bottom of the stack recursively.
- **Output**:
  The stack is successfully reversed using recursion.

---