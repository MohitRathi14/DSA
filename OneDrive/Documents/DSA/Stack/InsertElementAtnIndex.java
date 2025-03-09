import java.util.*;
class MyStackInsertElement {
    public void addElement(){
        Stack <Integer>  s1 = new Stack<Integer>();
        s1.push(78);
        s1.push(45);
        s1.push(65);
        s1.push(67);
        s1.push(69);
        System.out.println(s1);
        insertAtBottom(s1,100);
        System.out.println("Work Done");
        System.out.println(s1);



    }
    public void insertAtBottom(Stack<Integer> s1, int x){
        if (s1.size()<3) {
            s1.push(x);
            return;
        }
       
        if (s1.empty()) {
            
            return;
        
        }
        int top = (int)s1.peek();
        s1.pop();
        insertAtBottom(s1, x);
        s1.push(top);
        
        
        
    }

    
}
public class InsertElementAtnIndex {
    public static void main(String[] args) {
        MyStackInsertElement obj = new MyStackInsertElement();
        obj.addElement();
    }
}
