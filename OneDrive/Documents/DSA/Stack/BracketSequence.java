import java.util.*;
class MyStack {
    public void validate(){
        String s= "{([])}";
        int flag =0;
        Stack <Character>  s1 = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i)=='{'|| s.charAt(i)=='('||s.charAt(i)=='[') {
                s1.push(s.charAt(i));
            }
            else{
                if (!s1.empty()) {
                    char symbol = (char)s1.peek();
                    if (s.charAt(i)==')') {
                        if (symbol !='(') {
                            flag =1;
                            break;
                        }
                    }
                    if (s.charAt(i)=='}') {
                        if (symbol !='{') {
                            flag =1;
                            break;
                        }
                    }
                    if (s.charAt(i)==']') {
                        if (symbol !='[') {
                            flag =1;
                            break;
                        }
                    }
                    s1.pop();
                }
                
            }
            
        }
        if (flag==0) {
            System.out.println(s);
            System.out.println("valid opening and closing bracket");
        }
        else{
            System.out.println(s);
            System.out.println("Invalid opening and closing bracket");
        }
        
       
    }
}
public class BracketSequence {
    public static void main(String[] args) {
        MyStack p =new MyStack();
        p.validate();
    }
}
