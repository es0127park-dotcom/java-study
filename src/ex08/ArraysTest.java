package ex08;

import java.util.Arrays;

public class ArraysTest {
    public static void main(String[] args) {
        int[] array = { 9, 4, 5, 6, 2, 1 };
        Arrays.sort(array);
        for (int a : array){
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println(Arrays.binarySearch(array,9));
        Arrays.fill(array,8);
        for (int a : array){
            System.out.print(a + " ");
        }
    }
}
