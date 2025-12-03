package algo;

public class ChangeData3Me22 {
    public static void main(String[] args) {
        int[] arr = {7,4,2,3,1,5,6};
        int temp;
        int row1 = arr.length-1;
        int row2;
        int x;
        int y;

        x = 0;                                     //1회전
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

        x = 0;                                     //2회전
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

        x = 0;                                     //3회전
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

        x = 0;                                     //4회전
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

        x = 0;                                     //5회전
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

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
