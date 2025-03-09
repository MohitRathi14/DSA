import java.util.*;
class MyStackToValidate {
    public void validate(){
        String s= "India";
        Stack <Character>  s1 = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            s1.push(s.charAt(i));
        }
        System.out.println(s1);
        int count=0;
        while (!s1.empty()) {
            char ch =(char)s1.peek();
            if (ch>='A'&& ch<='Z') {
                count++;
            }
            s1.pop();
        }
        if (count>=2) {
            System.out.println("Invalid");

        }
        else{
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