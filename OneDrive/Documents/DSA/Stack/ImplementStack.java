class Node {
    int no;
    Node next;

    public Node(int no) {
        this.no = no;
        this.next = null;
    }
}
class CreateStack{
    Node top = null;
    public void push(int no){
        Node p = new Node(no);
        if (p == null) System.out.println("No More memory in system");
        p.next = top;
        top = p;
    }
}
public class ImplementStack {
    public static void main(String[] args) {
        CreateStack st = new CreateStack();
        st.push(100);

    }
}
