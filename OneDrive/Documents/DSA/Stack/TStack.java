import java.util.Stack;

class PStack {
    public void check(){
        Stack <Character>  s1 = new Stack<>();
        String s = "Racecar";
        int len = s.length();
        System.out.println(len);
        int p =len/2;
        System.out.println(p);
        for (int i = 0; i < p; i++) {
            s1.push(s.charAt(i));
        }
        System.out.println(s1);
        for (int i = p+1; i <len ; i++) {
            if (s1.peek()==s.charAt(i)) {
                s1.pop();
            }
        }
        System.out.println(s1);
        if (s1.empty()){
            System.out.println("String is palindrome");
        }
        else System.out.println("String is not palindrome");
    }
}
public class TStack{
    public static void main(String[] args) {
        PStack obj = new PStack();
        obj.check();
    }
}
