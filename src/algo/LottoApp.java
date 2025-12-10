package algo;

import java.util.Arrays;
import java.util.Random;

import static java.util.Arrays.binarySearch;

public class LottoApp {
    public static void main(String[] args) {
        int[] arr = new int[6];
        Random r = new Random();
        int n = r.nextInt(45)+1; // 1~45 중 랜덤
        int i = 0;

        while (i < 6){
            n = r.nextInt(45)+1;

            if (Arrays.binarySearch(arr,n) >= 0 && Arrays.binarySearch(arr,n) < 6){
                n = r.nextInt(45)+1;
            } else {
                arr[i] = n;
                i++;
            }
        }

        for (i = 0; i < 6; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
