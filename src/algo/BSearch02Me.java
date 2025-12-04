package algo;

import java.util.Arrays;

// 6 찾기
public class BSearch02Me {
    public static void main(String[] args) {
        int[] arr = {10,4,1,2,3,8,6}; // arr.length = 7(0~6번지)

        // 1. 정렬 {1,2,3,4,6,8,10)
        Arrays.sort(arr);       // 내가 코드 입력하지 않아도 라이브러리에서 가져다 쓸 수 있음

        int target = 6;
        int mid = arr.length; // 7

        // 2. 검색 (숫자 5 찾기)
        mid = mid/2;          // 3번지
        if (target == arr[mid]){   // 6=3번지(4)?
            System.out.println(target + "은 " + mid + "번지에 있습니다.");
        }

        if (target < arr[mid]){  // 6<3번지(4)?
            mid = mid/2;    // 1번지
            if (target == arr[mid]){

            }
        }

        System.out.println("main끝");
    }
}
