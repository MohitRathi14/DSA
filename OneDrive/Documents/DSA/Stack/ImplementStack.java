import java.text.MessageFormat;

class Node {
    int no;
    Node next;
    public Node(int no) {
        this.no = no;
        this.next=null;
    }
}
class CreateStack{
    Node top = null;
    public void push(int no){
        Node p = new Node(no);
        //if (p == null) System.out.println("No More memory in system");
        p.next=top;
        top = p;
    }
    public void traverse(){
        Node temp;
        temp =top;
        if (top==null){
            System.out.println("Stack is empty");
        }
        else {
            System.out.print("[");
            while(temp!=null){
                System.out.print(temp.no+"\t");
                temp = temp.next;
            }
            System.out.println("]");
        }
    }
    public String toString(){
        Node temp;
        temp =top;
        String s="";
        if (top==null){
            System.out.println("Stack is empty");
        }
        else {

            while(temp!=null){
               s = MessageFormat.format("{0}{1}\t", s, Integer.toString(temp.no));//this is done the concatenation
               temp = temp.next;
            }

        }
        return "["+s+"]";
    }
    public int peek(){
        if (top==null) {System.out.print("Stack is empty");
            return 0;
        }
        else return top.no;
    }
    public boolean empty(){
        return top != null;
    }
    public int search(int no){
        int i=1;
        Node temp = top;
        while (temp!=null){
            if (temp.no==no){
                i++;
            }
            temp =temp.next;
        }
        return i;
    }
    public void pop(){
//        Node temp = top;
        if(top!=null) top = top.next;
        else System.out.println("Stack is empty");


    }

}
public class ImplementStack {
    public static void main(String[] args) {
        CreateStack st = new CreateStack();
        st.push(10);
        st.push(67);
        st.push(45);
        st.push(78);
        st.traverse();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.empty());
        System.out.println(st.search(45));
        st.pop();
        System.out.println(st);
        System.out.println(st.peek());
        System.out.println(st.empty());
        System.out.println(st.search(45));
    }
}
