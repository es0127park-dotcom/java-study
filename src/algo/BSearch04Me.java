package algo;

import java.util.Arrays;

// 4 찾기
public class BSearch04Me {
    public static void main(String[] args) {
        int[] arr = {9,8,7,6,5,4,3,2,1};

        // 1. 정렬
        Arrays.sort(arr);  // 1,2,3,4,5,6,7,8,9,10,11

        int target = 1;
        int start = 0;
        int end = arr.length-1;
        int mid = (end-start)/2+start;

        // 2. 검색
        if(target == arr[mid]){
            System.out.println(target + "을 찾았습니다(1라운드): " + mid + "번지");
            return;
        }

        if (target > arr[mid]){
            start = mid+1;
            mid = (end-start)/2+start;
        }
        if (target < arr[mid]){
            end = mid-1;
            mid = (end-start)/2+start;
        }
        if(target == arr[mid]){
            System.out.println(target + "을 찾았습니다(2라운드): " + mid + "번지");
            return;
        }

        if (target > arr[mid]){
            start = mid+1;
            mid = (end-start)/2+start;
        }
        if (target < arr[mid]){
            end = mid-1;
            mid = (end-start)/2+start;
        }
        if(target == arr[mid]){
            System.out.println(target + "을 찾았습니다(3라운드): " + mid + "번지");
            return;
        }

        if (target > arr[mid]){
            start = mid+1;
            mid = (end-start)/2+start;
        }
        if (target < arr[mid]){
            end = mid-1;
            mid = (end-start)/2+start;
        }
        if(target == arr[mid]){
            System.out.println(target + "을 찾았습니다(4라운드): " + mid + "번지");
            return;
        }

        System.out.println("main끝");
    }
}
