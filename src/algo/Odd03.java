package algo;

public class Odd03 {
    public static void main(String[] args) {
        int num = 1;
        String result;

        for (int i = 0; i < 100; i++) {
            if (num%2 == 0){
                result = "짝수";
            }else{
                result = "홀수";
            }
            System.out.println(num + "은 " + result + "입니다.");
            num++;
        }
    }
}
