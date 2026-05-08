public class vower {
    public static void main(String[] args) {
        int count=0;
        String [] str = {"apple","orange","umbrella","elephant","india","guitar","zebra"};
        String [] s1 = new String[str.length];
        for (int i = 0; i < str.length; i++) {
            String s = str[i];
            boolean flag = false;
            for (int j = 0; j < s.length(); j++) {
                char ch = s.charAt(j);
                if (ch=='i' || ch=='o' || ch=='u' ||ch=='I' || ch=='O' || ch=='U') {
                    flag = true;
                    count++;
                    break;
                }
               
            }
             if (flag) {
                    s1[count]=str[i];
                }
            
            
        }
        for (int j = 0; j < s1.length; j++) {
                if (s1[j]!=null) {
                    System.out.print(s1[j] + " ");
                }
                
            }
        System.out.println("\n"+count);
    }
}
