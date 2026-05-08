public class sortArrayOfString {
    public static void main(String[] args) {
        String [] str = {"banana","apple","orange","grape","kiwi"};
        for (int i = 0; i < str.length-1; i++) {
            String s = str[i];
            int index = Math.min(s.length(), str[i+1].length());
            for (int j = 0; j < index; j++) {
                char ch = s.charAt(j);
                if (ch>str[i+1].charAt(j)) {
                    String temp = str[i];
                    str[i]=str[i+1];
                    str[i+1]=temp;
                    break;
                }
                else if (ch<str[i+1].charAt(j)) {
                    break;
                }
            }
        }
        for (int i = 0; i < str.length; i++) {
            System.out.print(str[i]+" ");
        }
    }
}
