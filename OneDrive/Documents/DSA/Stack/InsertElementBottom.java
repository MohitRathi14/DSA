import java.util.*;
class MyStackInsertAtBottom {
    public void insertAtBottom(Stack<Integer> s1, int x){
        if (s1.empty()) {
            s1.push(x);
            return;
        }
        int top = (int)s1.peek();
        s1.pop();
        insertAtBottom(s1, x);
        s1.push(top);
    }
    public void addElement(){
        Stack <Integer>  s1 = new Stack<Integer>();
        s1.push(78);
        s1.push(45);
        s1.push(65);
        s1.push(67);
        System.out.println(s1);
        insertAtBottom(s1,100);
        System.out.println("Work Done");
        System.out.println(s1);



    }
    
}
public class InsertElementBottom {
    public static void main(String[] args) {
        MyStackInsertAtBottom obj = new MyStackInsertAtBottom();
        obj.addElement();
    }
}
