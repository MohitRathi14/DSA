public class rotateSting {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("abcd");
        StringBuffer s = new StringBuffer("cdab");
        if (str.equals(s)) {
            System.out.println("true");
        }
        for (int i = 0; i < str.length()-1; i++) {
            
            str = Ststr.substring(i+1,str.length()-1)+str.charAt(i);
            
        }
    }
}
