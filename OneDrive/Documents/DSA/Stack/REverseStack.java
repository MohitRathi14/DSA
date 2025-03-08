import java.util.Stack;
class MyStack{
    public void addElement(){
        Stack<Integer> st=new Stack<Integer>();
        st.push(78);
        st.push(45);
        st.push(65);
        st.push(67);
        st.push(35);
        System.out.println(st);
        reverse(st);
        System.out.println(st);
    }
    public void reverse(Stack <Integer> st ){
        
        if (st.empty()) {
            return;
        }
        int top=(int)st.peek();
        st.pop();
        reverse(st); 
        insertAtButtom(st, top);
        
    }
    public void insertAtButtom(Stack <Integer> st, int element){
        if (st.empty()) {
            st.push(element);
            return;
    }
        int top = st.pop();
        insertAtButtom(st, element);
        st.push(top);
    }
}
public class REverseStack {
    public static void main(String[] args) {
        MyStack p = new MyStack();
        p.addElement();
    }
}


