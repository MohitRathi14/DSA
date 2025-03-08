import java.util.*;
class MyStack {
    public void insertAtButtom(Stack<Integer> s1,int x){
        if (s1.empty()) {
            s1.push(x);
            return;
        }
        int top = (int)s1.peek();
        s1.pop();
        insertAtButtom(s1, x);
        s1.push(top);
    }
    public void show(){
        Stack <Integer>  s1 = new Stack<Integer>();
        s1.push(78);
        s1.push(45);
        s1.push(65);
        s1.push(67);
        System.out.println(s1);
        insertAtButtom(s1,100);
        System.out.println("Work Done");
        System.out.println(s1);



    }
    
}
public class InsertElementBouttom {
    public static void main(String[] args) {
        MyStack obj = new MyStack();
        obj.show();
    }
}
