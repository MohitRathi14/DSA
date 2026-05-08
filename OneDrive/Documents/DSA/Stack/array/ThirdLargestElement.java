
public class ThirdLargestElement {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 11, 5, 6, 8, 2};
        GetThirdLergestElement obj = new GetThirdLergestElement();
        obj.getThirdLergestElement(arr);
    }
}
class GetThirdLergestElement{
    
    public void getThirdLergestElement(int[]arr){
        int largest = Integer.MIN_VALUE;
        int secoundLargest = Integer.MIN_VALUE;
        int thirdLargestElement = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (largest<arr[i]) {
                thirdLargestElement=secoundLargest;
                secoundLargest=largest;
                largest=arr[i];

            }
            else if (secoundLargest<arr[i]) {
                
                thirdLargestElement=secoundLargest;
                secoundLargest=arr[i];
            }
            else if(thirdLargestElement<arr[i]){
                thirdLargestElement=arr[i];
            }
        }
        System.out.println(thirdLargestElement);
    }
}


