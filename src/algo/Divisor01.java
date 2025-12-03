package algo;

/**
 * 12의 약수를 출력하시오.
 * (1) 비지니스 이해 -> 12를 1~12까지 나눠서 나누어 떨어지면 약수)
 * (2) 샘플링 -> 6의 약수 구하기
 * (3) 노가다
 * (4) 패턴 찾기
 */
public class Divisor01 {
    public static void main(String[] args) {
        int n = 1;
        String result;

        for (int i = 0; i < 6; i++) {
            if (6%n == 0) {
                result = "맞음";
            }else {
                result = "아님";
            }
            System.out.println(n + "은 약수 " + result);
            n++;
        }
    }
}
