public class SecoundLargestElement{
    public static void main(String [] args){
        int[] arr = {
            1,2,3,4,11,5,6,8,2
        };
        if (arr.length<2) {
            System.out.println("The array must have at leat two element");
        }
        int largest=Integer.MIN_VALUE;
        int secoundLargest = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            
            
            if (largest<arr[i]) {
                secoundLargest=largest;
                largest=arr[i];
            }
            else if(secoundLargest<arr[i]){
                secoundLargest=arr[i];
                
            }
        }
        if (secoundLargest==Integer.MIN_VALUE) {
            System.out.println("No secound leargest elemnt found");
        }
        else{
            System.out.println(secoundLargest);
        }
        
    }
}