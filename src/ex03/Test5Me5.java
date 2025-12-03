package ex03;

public class Test5Me5 {
    public static void main(String[] args) {
        int x = 5;
        int y = 5;
        int z = 0;

        for (int k = 0; k < x; k++) {
            y--;
            for (int i = 0; i < y; i++) {
                System.out.print(" ");
            }
            z++;
            for (int j = 0; j < z; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
