import java.util.Stack;
import java.util.Vector;

class NextSmallerElement{
    public void nextSmallerElement (int [] a){
        Stack <Integer> stack = new Stack<>();

        Vector <Integer> v = new Vector<>();
        for (int i = a.length -1; i >=0; i--) {
            while (!stack.empty() && (stack.peek() >= a[i])){
                stack.pop();
            }
            if (stack.empty()){
                v.add(-1);
            }
            else {
                v.add(stack.peek());
            }
            stack.push(a[i]);
        }
        System.out.println(v);
    }
}
public class Problem {
    public static void main(String[] args) {
//        //using array and for loop
//        int []arr = {23,44,15,68,44};
//
//       for (int i = 0; i < arr.length ; i++) {
//           int min = arr[i];
//           for (int j = i+1; j < arr.length; j++) {
//
//                if(min>arr[j]){
//                    min=arr[j];
//                }
//
//           }
//           if(min != arr[i]){
//               System.out.println(min);
//           }
//           else System.out.println("-1");
//       }
        //using Stack
//        int[] arr = {23, 44, 15, 68, 44};
//        Stack<Integer> stack = new Stack<>();
//
//        // Push all elements onto the stack
//        for (int num : arr) {
//            stack.push(num);
//        }
//
//        // Process each element
//        for (int i = 0; i < arr.length; i++) {
//            int min = stack.get(i);
//            boolean found = false;
//
//            // Find the minimum element to the right
//            for (int j = i + 1; j < arr.length; j++) {
//                if (stack.get(j) < min) {
//                    min = stack.get(j);
//                    found = true;
//                }
//            }
//
//            // Print the result
//            if (found) {
//                System.out.println(min);
//            } else {
//                System.out.println("-1");
//            }
            //using stack and recursion
            int [] arr = {12,11,19,40,7,42,55,40};
            NextSmallerElement obj = new NextSmallerElement();
            obj.nextSmallerElement(arr);
        }

    }

