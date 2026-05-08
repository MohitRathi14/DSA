public class MaxConsucativeOne {
    public static void main(String[] args) {
        int [] arr = {0, 1, 0, 1, 1, 1, 1};
        int maxCount=0;
        int count =1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i]==arr[i-1]) {
                count++;
            }
            else{
                if (maxCount<count) {
                    maxCount=count;
                }
                count=1;
            }
        }
        if (maxCount>count) {
            System.out.println(maxCount);
        }
        else{
            System.out.println(count);
        }
        
    }
}
