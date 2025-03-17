# Java Program to Validate Username Using Stack

This Java program validates whether a given username string satisfies specific conditions using a stack. The rules for a "valid" username are:

1. It must contain at least **2 uppercase letters**.
2. It must contain at least **3 lowercase letters**.
3. It must contain at least **2 underscores (`_`)**.
4. It must contain exactly **1 `@` symbol**.

If these conditions are met, the username is considered valid; otherwise, it is invalid.

---

## Code Implementation

```java
import java.util.*;
class MyStackValidUser {
    public void validate() {
        String s = "Mohit__Rathi@M";
        Stack<Character> s1 = new Stack<Character>();
        
        // Push all characters of the string onto the stack
        for (int i = 0; i < s.length(); i++) {
            s1.push(s.charAt(i));
        }
        System.out.println(s1); // Print the stack (for debugging)
        
        // Counters for validation
        int countU = 0;          // Count of uppercase letters
        int countL = 0;          // Count of lowercase letters
        int countUnder = 0;      // Count of underscores
        int countAddtheRate = 0; // Count of '@' symbols
        
        // Process the stack
        while (!s1.empty()) {
            char ch = (char) s1.peek();
            
            // Check the type of character
            if (ch >= 'A' && ch <= 'Z') countU++; // Uppercase letter
            if (ch >= 'a' && ch <= 'z') countL++; // Lowercase letter
            if (ch == '_') countUnder++;          // Underscore
            if (ch == '@') countAddtheRate++;     // '@' symbol
            
            s1.pop(); // Remove character from the stack
        }
        
        // Validate the username
        if (countU >= 2 && countL >= 3 && countAddtheRate == 1 && countUnder >= 2) {
            System.out.println("Valid username");
        } else {
            System.out.println("InValid username");
        }
    }
}

public class ValidUserName {
    public static void main(String[] args) {
        MyStackValidUser p = new MyStackValidUser();
        p.validate();
    }
}
```

---

## How the Program Works

1. **Initial Setup**:
    - A `String` representing the username is initialized (e.g., `"Mohit__Rathi@M"`).
    - A `Stack` is used to store all characters of the string temporarily.

2. **Iteration Through the String**:
    - Each character of the string is pushed onto the stack.

3. **Counting Character Types**:
    - The characters are popped from the stack one by one.
    - For each character:
        - If it’s an **uppercase letter** (`A-Z`), increment the `countU`.
        - If it’s a **lowercase letter** (`a-z`), increment the `countL`.
        - If it’s an **underscore (`_`)**, increment the `countUnder`.
        - If it’s an **`@` symbol**, increment the `countAddtheRate`.

4. **Validation Check**:
    - After processing all characters, the program checks if the username satisfies the following conditions:
        - At least 2 uppercase letters (`countU >= 2`).
        - At least 3 lowercase letters (`countL >= 3`).
        - Exactly 1 `@` symbol (`countAddtheRate == 1`).
        - At least 2 underscores (`countUnder >= 2`).

5. **Output**:
    - If all conditions are satisfied, it prints `"Valid username"`.
    - Otherwise, it prints `"InValid username"`.

---

## Sample Input and Output

### Input:
```java
String s = "Mohit__Rathi@M";
```

### Process:
- **Uppercase Letters**: `"M"`, `"R"`, `"M"` → `countU = 3`
- **Lowercase Letters**: `"o"`, `"h"`, `"i"`, `"t"`, `"a"`, `"t"`, `"h"`, `"i"` → `countL = 8`
- **Underscores**: `"_"`, `"_"` → `countUnder = 2`
- **`@` Symbol**: `"@"` → `countAddtheRate = 1`

### Output: Valid username
---

## Points for Improvement
1. **Remove Unnecessary Stack**:
    - Using a stack for this problem is not necessary. A simple loop through the string would suffice, making the code more efficient.

2. **Dynamic Input**:
    - Replace the hardcoded string `"Mohit__Rathi@M"` with dynamic user input for versatility.

3. **Detailed Error Messages**:
    - Provide specific feedback about why the username is invalid (e.g., "Must contain at least 2 uppercase letters.").

---

## Example Updated Output (with Feedback)

Input: `"Test_@1"`
Output:InValid username: Must contain at least 2 uppercase letters, at least 3 lowercase letters, and at least 2 underscores
