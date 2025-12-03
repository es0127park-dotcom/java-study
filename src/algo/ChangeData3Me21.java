package algo;

public class ChangeData3Me21 {
    public static void main(String[] args) {
        int[] arr = {7,4,2,3,1,5,6};
        int temp;

        // 0,1 비교 -> 참 -> 스왑 {4,7,2,3,1,5,6} 1회차-1
        if (arr[0] > arr[1]){
            temp = arr[1];
            arr[1] = arr[0];
            arr[0] = temp;
        }

        // 1,2 비교 -> 참 -> 스왑 {4,2,7,3,1,5,6} 1회차-2
        if (arr[1] > arr[2]){
            temp = arr[2];
            arr[2] = arr[1];
            arr[1] = temp;
        }

        // 2,3 비교 -> 참 -> 스왑 {4,2,3,7,1,5,6} 1회차-3
        if (arr[2] > arr[3]){
            temp = arr[3];
            arr[3] = arr[2];
            arr[2] = temp;
        }

        // 3,4 비교 -> 참 -> 스왑 {4,2,3,1,7,5,6} 1회차-4
        if (arr[3] > arr[4]){
            temp = arr[4];
            arr[4] = arr[3];
            arr[3] = temp;
        }

        // 4,5 비교 -> 참 -> 스왑 {4,2,3,1,5,7,6} 1회차-5
        if (arr[4] > arr[5]){
            temp = arr[5];
            arr[5] = arr[4];
            arr[4] = temp;
        }

        // 5,6 비교 -> 참 -> 스왑 {4,2,3,1,5,6,7} 1회차-6
        if (arr[5] > arr[6]){
            temp = arr[6];
            arr[6] = arr[5];
            arr[5] = temp;
        }

        // 0,1 비교 -> 참 -> 스왑 {2,4,3,1,5,6,7} 2회차-1
        if (arr[0] > arr[1]){
            temp = arr[1];
            arr[1] = arr[0];
            arr[0] = temp;
        }

        // 1,2 비교 -> 참 -> 스왑 {2,3,4,1,5,6,7} 2회차-2
        if (arr[1] > arr[2]){
            temp = arr[2];
            arr[2] = arr[1];
            arr[1] = temp;
        }

        // 2,3 비교 -> 참 -> 스왑 {2,3,1,4,5,6,7} 2회차-3
        if (arr[2] > arr[3]){
            temp = arr[3];
            arr[3] = arr[2];
            arr[2] = temp;
        }

        // 3,4 비교 -> 참 -> 스왑 {2,3,1,4,5,6,7} 2회차-4
        if (arr[3] > arr[4]){
            temp = arr[4];
            arr[4] = arr[3];
            arr[3] = temp;
        }

        // 4,5 비교 -> 참 -> 스왑 {2,3,1,4,5,6,7} 2회차-5
        if (arr[4] > arr[5]){
            temp = arr[5];
            arr[5] = arr[4];
            arr[4] = temp;
        }

        // 5,6 비교 -> 참 -> 스왑 {2,3,1,4,5,6,7} 2회차-6
        if (arr[5] > arr[6]){
            temp = arr[6];
            arr[6] = arr[5];
            arr[5] = temp;
        }

        // 0,1 비교 -> 참 -> 스왑 {2,3,1,4,5,6,7} 3회차-1
        if (arr[0] > arr[1]){
            temp = arr[1];
            arr[1] = arr[0];
            arr[0] = temp;
        }

        // 1,2 비교 -> 참 -> 스왑 {2,1,3,4,5,6,7} 3회차-2
        if (arr[1] > arr[2]){
            temp = arr[2];
            arr[2] = arr[1];
            arr[1] = temp;
        }

        // 2,3 비교 -> 참 -> 스왑 {2,1,3,4,5,6,7} 3회차-3
        if (arr[2] > arr[3]){
            temp = arr[3];
            arr[3] = arr[2];
            arr[2] = temp;
        }

        // 3,4 비교 -> 참 -> 스왑 {2,1,3,4,5,6,7} 3회차-4
        if (arr[3] > arr[4]){
            temp = arr[4];
            arr[4] = arr[3];
            arr[3] = temp;
        }

        // 4,5 비교 -> 참 -> 스왑 {2,1,3,4,5,6,7} 3회차-5
        if (arr[4] > arr[5]){
            temp = arr[5];
            arr[5] = arr[4];
            arr[4] = temp;
        }

        // 5,6 비교 -> 참 -> 스왑 {2,1,3,4,5,6,7} 3회차-6
        if (arr[5] > arr[6]){
            temp = arr[6];
            arr[6] = arr[5];
            arr[5] = temp;
        }

        // 0,1 비교 -> 참 -> 스왑 {1,2,3,4,5,6,7} 4회차-1
        if (arr[0] > arr[1]){
            temp = arr[1];
            arr[1] = arr[0];
            arr[0] = temp;
        }

        // 1,2 비교 -> 참 -> 스왑 {1,2,3,4,5,6,7} 4회차-2
        if (arr[1] > arr[2]){
            temp = arr[2];
            arr[2] = arr[1];
            arr[1] = temp;
        }

        // 2,3 비교 -> 참 -> 스왑 {1,2,3,4,5,6,7} 4회차-3
        if (arr[2] > arr[3]){
            temp = arr[3];
            arr[3] = arr[2];
            arr[2] = temp;
        }

        // 3,4 비교 -> 참 -> 스왑 {1,2,3,4,5,6,7} 4회차-4
        if (arr[3] > arr[4]){
            temp = arr[4];
            arr[4] = arr[3];
            arr[3] = temp;
        }

        // 4,5 비교 -> 참 -> 스왑 {1,2,3,4,5,6,7} 4회차-5
        if (arr[4] > arr[5]){
            temp = arr[5];
            arr[5] = arr[4];
            arr[4] = temp;
        }

        // 5,6 비교 -> 참 -> 스왑 {1,2,3,4,5,6,7} 4회차-6
        if (arr[5] > arr[6]){
            temp = arr[6];
            arr[6] = arr[5];
            arr[5] = temp;
        }

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
