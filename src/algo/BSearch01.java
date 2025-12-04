package algo;

import java.util.Arrays;  // Arrays 대신 * 입력하면 java.util 패키지에 있는 모든 것 가져올 수 있음

// 10 찾기
public class BSearch01 {
    public static void main(String[] args) {
        int[] arr = {10,4,1,2,3};

        // 1. 정렬 {1,2,3,4,10)
        Arrays.sort(arr);       // 내가 코드 입력하지 않아도 라이브러리에서 가져다 쓸 수 있음

        // 2. 검색 (숫자 2 찾기)
        if(10 == arr[2]){
            System.out.println("10를 찾았습니다.");
        }

        if(10 < arr[2]){ // false
            System.out.println("10는 작아요.");

            if(10 == arr[1]){
                System.out.println("10를 찾았습니다.");
            }
        }else{
            System.out.println("10은 커요.");

            if(10 == arr[3]){
                System.out.println("10을 찾았습니다.");
            }else{
                System.out.println("arr[4]번지에 10이 있습니다.");
            }
        }

        System.out.println("main끝");
    }
}
