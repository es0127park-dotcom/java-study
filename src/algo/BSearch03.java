package algo;

import java.util.Arrays;

// 4 찾기
public class BSearch03 {
    public static void main(String[] args) {
        int[] arr = {10, 4, 1, 2, 3, 0, 11};

        // 1. 정렬
        Arrays.sort(arr);  // 0, 1, 2, 3, 4, 10, 11

        int target = 11;
        int mid = arr.length/2; // 3

        // 2. 검색
        if(target == arr[mid]){  // 0, 1, 2, [3], 4, 10, 11
            System.out.println(target+"를 찾았습니다.");
            return;  // return 되면 main 종료! main 끝 출력 안됨
        }

        if (target > arr[mid]){  // true
            mid = 5;
        }

        if (target < arr[mid]){
            mid = 1;
        }

        if(target == arr[mid]){  // 0, 1, 2, 3, 4, [10], 11
            System.out.println(target+"를 찾았습니다.");
            return;
        }

        if (target > arr[mid]){
            mid = 6;
        }

        if (target < arr[mid]){
            mid = 4;
        }

        if(target == arr[mid]){  // 0, 1, 2, 3, 4, 10, [11]
            System.out.println(target+"를 찾았습니다.");
            return;
        }

        System.out.println("main끝");
    }
}
