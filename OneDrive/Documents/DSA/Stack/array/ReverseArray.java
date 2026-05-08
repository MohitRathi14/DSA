public class ReverseArray {
    public static void main(String[] args) {
       int[] arr = {1, 2, 3, 4, 11, 5, 6, 8, 2};
        int n =arr.length ;
        for(int i=0;i<n/2;i++){
            arr[i]= arr[i]+arr[n-i-1];
            arr[n-i-1] = arr[i]-arr[n-i-1];
            arr[i]=arr[i]-arr[n-i-1];
        }
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
    
    
}
