package algo;

public class ChangeData3Me23 {
    public static void main(String[] args) {
        int[] arr = {7,4,2,3,1,5,6};
        int temp;
        int row1 = arr.length-1;
        int row2 = arr.length-1;
        int x;
        int y;

        for (int k = 0; k < row2; k++) {
            x = 0;
            y = 1;
            for (int i = 0; i < row1; i++) {
                if (arr[x] > arr[y]){
                    temp = arr[y];
                    arr[y] = arr[x];
                    arr[x] = temp;
                }
                x++;
                y++;
            }
            row1--;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
