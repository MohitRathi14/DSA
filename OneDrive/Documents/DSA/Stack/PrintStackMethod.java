import java.util.Stack;

class PrintStack {
    public void show() {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(67);
        st.push(78);
        st.push(56);
        System.out.println(st);
        //using loop
        for (int i =0; i <  st.size()  ; i++) {
            System.out.print(st.get(i)+"\t");
        }
        //to reverse
        for (int i =st.size()-1; i >=0 ; i--) {
            System.out.print(st.get(i)+"\t");
        }
    }
}
public class PrintStackMethod {
    public static void main(String[] args) {
        PrintStack ps = new PrintStack();
        ps.show();
    }
}

