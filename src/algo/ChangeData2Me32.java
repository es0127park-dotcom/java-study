package algo;

public class ChangeData2Me32 {
    public static void main(String[] args) {
        // {1,2,3,4,5,6,7,8,9,10} -> {10,9,8,7,6,5,4,3,2,1} reverse

        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int temp;
        int x = 9;
        int y = 0;

        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        x--;
        y++;

        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        x--;
        y++;

        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        x--;
        y++;

        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        x--;
        y++;

        temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        x--;
        y++;

        for (int i = 0; i < 10; i++) {
            System.out.println(arr[i]);
        }
    }
}
