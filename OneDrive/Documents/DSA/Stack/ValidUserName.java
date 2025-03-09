import java.util.*;
class MyStackValidUser {
    public void validate(){
        String s= "Mohit__Rathi@M";
        Stack <Character>  s1 = new Stack<Character>();
        for (int i = 0; i < s.length(); i++) {
            s1.push(s.charAt(i));
        }
        System.out.println(s1);
        int countU=0;
        int countL=0;
        int countUnder =0;
        int countAddtheRate=0;
        while (!s1.empty()) {
            char ch =(char)s1.peek();
            if (ch>='A'&& ch<='Z') {
                countU++;
            }
            if (ch>='a'&& ch<='z') {
                countL++;
            }
            if (ch=='_') {
                countUnder++;
            }
            if (ch=='@') {
                countAddtheRate++;
            }
            s1.pop();
        }
        if (countU>=2&&countL>=3&&countAddtheRate==1&&countUnder>=2) {
            System.out.println("Valid username");

        }
        else{
            System.out.println("InValid username");
        }
    }
    
}
public class ValidUserName {
    public static void main(String[] args) {
        MyStackValidUser p =new MyStackValidUser();
        p.validate();
    }
}
