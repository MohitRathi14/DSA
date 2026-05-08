public class MoveAllZeroToEnd {
    public static void main(String[] args) {
        int [] arr = {1, 2, 0, 4, 3, 0, 5, 0};
        int [] temp = new int[arr.length];
        int index =0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]!=0) {
                temp[index]=arr[i];
                index++;
            }
        }
        for (int i = 0; i < temp.length; i++) {
            System.out.println(temp[i]);
        }
    }
}
