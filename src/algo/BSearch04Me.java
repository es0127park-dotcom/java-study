package algo;

import java.util.Arrays;

// 4 찾기
public class BSearch04Me {
    public static void main(String[] args) {
        int[] arr = {10, 4, 1, 2, 3, 0, 11};

        // 1. 정렬
        Arrays.sort(arr);  // 0, 1, 2, 3, 4, 10, 11

        int target = 11;
        int mid = arr.length/2; // 3

        // 2. 검색
        if(target == arr[mid]){  // 0, 1, 2, [3], 4, 10, 11
            System.out.println(target + "은 " + mid + "번지에 있습니다.");
            return;
        }

        if (target > arr[mid]){  // true
            mid = mid+(arr.length-mid)/2;
        }

        if (target < arr[mid]){
            mid = mid-(arr.length-mid)/2;
        }

        if(target == arr[mid]){  // 0, 1, 2, 3, 4, [10], 11
            System.out.println(target + "은 " + mid + "번지에 있습니다.");
            return;
        }

        if (target > arr[mid]){
            mid = mid+(arr.length-mid)/2;
        }

        if (target < arr[mid]){
            mid = mid-(arr.length-mid)/2;
        }

        if(target == arr[mid]){  // 0, 1, 2, 3, 4, 10, [11]
            System.out.println(target + "은 " + mid + "번지에 있습니다.");
            return;
        }

        System.out.println("main끝");
    }
}
