import java.util.Stack;
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
        int[] arr = {23, 44, 15, 68, 44};
        Stack<Integer> stack = new Stack<>();

        // Push all elements onto the stack
        for (int num : arr) {
            stack.push(num);
        }

        // Process each element
        for (int i = 0; i < arr.length; i++) {
            int min = stack.get(i);
            boolean found = false;

            // Find the minimum element to the right
            for (int j = i + 1; j < arr.length; j++) {
                if (stack.get(j) < min) {
                    min = stack.get(j);
                    found = true;
                }
            }

            // Print the result
            if (found) {
                System.out.println(min);
            } else {
                System.out.println("-1");
            }
        }

    }
}
