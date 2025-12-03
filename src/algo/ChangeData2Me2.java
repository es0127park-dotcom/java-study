package algo;

public class ChangeData2Me2 {
    public static void main(String[] args) {
        // {1,2,3,4,5,6,7} -> {7,6,5,4,3,2,1} reverse

        int[] arr = {1,2,3,4,5,6,7};
        int temp;

        temp = arr[6];
        arr[6] = arr[0];
        arr[0] = temp;

        temp = arr[5];
        arr[5] = arr[1];
        arr[1] = temp;

        temp = arr[4];
        arr[4] = arr[2];
        arr[2] = temp;

        for (int i = 0; i < 7; i++) {
            System.out.println(arr[i]);
        }
    }
}
