public class StockBuyAndSell {
    public static void main(String[] args) {
        //logic 1 is correct but takes more time.The time complexity is O(n^2)
        // int [] arr = {2,7,1,9,10,6};  
        // int maxProfit = 0;
        // for (int i = 1; i < arr.length; i++) {

        //     for (int j = i; j < arr.length; j++) {
        //         int d = arr[j] - arr[i-1];
        //         if (d>maxProfit) {
        //             maxProfit = d;
        //         }
        //     }
        // }
        // System.out.println(maxProfit);
        //logic 2 is correct and takes less time.The time complexity is O(n)
        int [] arr = {2,7,1,9,10,6};
        int minSoFar = arr[0];
        int maxProfit = 0;
        for (int i = 1; i < arr.length; i++) {
            //updating minSoFar if current element is smaller than minSoFar 
            minSoFar=minSoFar<arr[i]?minSoFar:arr[i];

            //calculating maxProfit by comparing current maxProfit and profit obtained by selling at current element
            maxProfit = maxProfit>(arr[i]-minSoFar)?maxProfit:(arr[i]-minSoFar);
        }
        
        System.out.println(maxProfit);
    }
}
