package algo;

public class ChangeData2Me33 {
    public static void main(String[] args) {
        // {1,2,3,4,5,6,7,8,9,10} -> {10,9,8,7,6,5,4,3,2,1} reverse

        int[] arr = {1,2,3,4,5,6,7,8,9,10};   // 입력값. 배열 입력
        int temp;
        int z = arr.length/2;                 // 고정값. 치환 횟수
        int x = arr.length-1;                 // 고정값. arr 마지막 번지 수
        int y = 0;                            // 고정값. arr 첫 번째 번지 수

        for (int i = 0; i < z; i++) {
            temp = arr[x];
            arr[x] = arr[y];
            arr[y] = temp;
            x--;
            y++;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
