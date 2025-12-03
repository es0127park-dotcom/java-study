package algo;

public class ChangeData2Me1 {
    public static void main(String[] args) {
        // {1,2,3,4,5} -> {5,4,3,2,1} reverse

        int[] arr = {1,2,3,4,5};

        int temp1 = arr[4];
        arr[4] = arr[0];
        arr[0] = temp1;

        int temp2 = arr[3];
        arr[3] = arr[1];
        arr[1] = temp2;

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
