package ex03;

public class Test4Me {
    public static void main(String[] args) {
        int k = 6;

        for (int j = 0; j < 5; j++) {
            k--;
            for (int i = 0; i < k; i++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
