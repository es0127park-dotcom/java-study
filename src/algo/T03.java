package algo;

/**
 * 1~100까지의 수에서 2의 배수를 출력하시오.
 * (1) 비지니스
 * (2) 샘플링
 * (3) 노가다
 * (4) 패턴
 */
public class T03 {
    public static void main(String[] args) {
        // 1~10
        int num = 1; // 시작 수
        int row = 100; // 회전 수(끝 수)
        int div = 2; // 배수

        System.out.print(div + "의 배수는");

        for (int i = 0; i < row; i++) {
            if (num%div == 0){
                System.out.print(" "+num);
            }
            num++;
        }

        System.out.println("입니다.");
    }
}
