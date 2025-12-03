package algo;

public class ChangeData {
    public static void main(String[] args) {
        // 배열 만들어서 순서 바꾸기
        // {1,2,3} -> {3,2,1} reverse

        int[] arr = {1,2,3};

        int temp = arr[2]; // 2. arr 2번지에 있는 3을 temp에 보관
        arr[2] = arr[0];   // 1. 이렇게만 하면 {1,2,1}이 되서 3이 날라가기 때문에 작업하기 전에 3을 다른 곳에 보관해야 함
        arr[0] = temp;     // 3. temp에 있던 3이 arr 0번지에 보관되서 {3,2,1}이 됨

        for (int i = 0; i < arr.length; i++) {  // arr배열의 길이
            System.out.println(arr[i]);
        }
    }
}
