# Java Code: Validate String Using Stack

This code demonstrates how to use a `Stack` in Java to validate a string based on the number of uppercase letters it contains.

```java
import java.util.*;

class MyStackToValidate {
    public void validate(){
        String s = "India"; // The string to validate
        Stack<Character> s1 = new Stack<Character>();

        // Push each character of the string onto the stack
        for (int i = 0; i < s.length(); i++) {
            s1.push(s.charAt(i));
        }

        // Print the contents of the stack
        System.out.println(s1);

        int count = 0;

        // Count uppercase letters while processing the stack
        while (!s1.empty()) {
            char ch = (char) s1.peek(); // Peek the top of the stack
            if (ch >= 'A' && ch <= 'Z') {
                count++; // Increment if the character is uppercase
            }
            s1.pop(); // Remove the top of the stack
        }

        // Validate the string based on the uppercase letter count
        if (count >= 2) {
            System.out.println("Invalid");
        } else {
            System.out.println("Valid");
        }
    }
}

public class ValidateString {
    public static void main(String[] args) {
        MyStackToValidate p = new MyStackToValidate();
        p.validate();
    }
}
```

## How It Works

- **String Initialization:** It validates the hard-coded string `"India"`.
- **Stack Usage:** Individual characters from the string are pushed onto a stack for processing.
- **Uppercase Count:** The code counts the number of uppercase letters in the string using the stack.
- **Validation:**
    - If the string has **2 or more uppercase letters**, it prints `"Invalid"`.
    - Otherwise, it prints `"Valid"`.

## Sample Output

For the string `"India"`, the output will be:
[I, n, d, i, a] Valid


To make the program more dynamic, the string `"India"` can be replaced with user input using a `Scanner`.