package algo;

/**
 * 1부터 100까지 수를 출력하는데, 홀수이면 홀수, 짝수이면 짝수로 출력하시오.
 * (1) 비즈니스 상상해보기 (2로 나누었을 때 나머지가 있으면 홀수, 없으면 짝수)
 * (2) 샘플링하기 5개 (1~5)까지만 해야지! (범위 줄여서 샘플링 but 너무 작아도, 너무 많아도 안 됨)
 * (3) 노가다
 * (4) 패턴 찾기
 */
public class Odd02 {
    public static void main(String[] args) {
        int num = 1;
        String result = "홀수";

        // num = 1
        if (num%2 == 0){
            result = "짝수";
        }else{
            result = "홀수";
        }
        System.out.println(num + "은 " + result + "입니다.");
        num++;

        // num = 2
        if (num%2 == 0){
            result = "짝수";
        }else{
            result = "홀수";
        }
        System.out.println(num + "은 " + result + "입니다.");
        num++;

        // num = 3
        if (num%2 == 0){
            result = "짝수";
        }else{
            result = "홀수";
        }
        System.out.println(num + "은 " + result + "입니다.");
        num++;

        // num = 4
        if (num%2 == 0){
            result = "짝수";
        }else{
            result = "홀수";
        }
        System.out.println(num + "은 " + result + "입니다.");
        num++;

        // num = 5
        if (num%2 == 0){
            result = "짝수";
        }else{
            result = "홀수";
        }
        System.out.println(num + "은 " + result + "입니다.");
        num++;
    }
}
