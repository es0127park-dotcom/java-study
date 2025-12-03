package ex03;

import java.util.Scanner;

public class Test3T {
    public static void main(String[] args) {
        int sum=0;
        int i = 0;

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int j = 0; j < n; j++) {
            i++;
            sum = sum + i;
        }

        System.out.println(sum);
    }
}
