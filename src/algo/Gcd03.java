package algo;

/**
 * 6의 약수를 구하고, 8의 약수를 구해서 최대공약수 찾기
 * (1) 비지니스 (6을 1~6까지 나눠서 떨어지는 약수 - 배열에 담기)
 * (2)        (8을 1~8까지 나눠서 떨어지는 약수 - 배열에 담기)
 * (3) arr1 = [1,2,3,6]
 * (4) arr2 = [1,2,4,8]
 * (5) 두 배열을 비교해서 최대공약수 찾기
 * 후보 1 -> 2 int result 담기 (후보 1을 2로 덮어씌움 -> 마지막 후보군이 최대공약수)
 */
public class Gcd03 {

    static void 약수구하기(int a){
        int[] arr1 = new int[a];
        int n1 = 0;
        int k1 = 1;
        for (int i = 0; i < a; i++) {
            if (a % k1 == 0) {
                arr1[n1] = k1;
                n1++;
            }
            k1++;
        }
    }

    public static void main(String[] args) {
        int a = 6;
        int b = 8;

        int[] arr1 = new int[6]; // [1][2][3][6][0][0]
        int[] arr2 = new int[8]; // [1][2][4][8][0][0][0][0]

        // 1. 6의 약수 채우기 ================================================================
        int n1 = 0; // 배열의 위치를 나타내는 번호값 = 인덱스
        int k1 = 1;
        for (int i = 0; i < a; i++) {
            if (a % k1 == 0) {
                arr1[n1] = k1;
                n1++;
            }
            k1++;
        }

        // 2. 8의 약수 채우기 ================================================================
        int n2 = 0;
        int k2 = 1;
        for (int i = 0; i < b; i++) {
            if (b % k2 == 0) {
                arr2[n2] = k2;
                n2++;
            }
            k2++;
        }

        // 3. 최대공약수 구하기 ==================================================
        int result = 0;
        int c = 0;

        for (int i = 0; i < 4; i++) {
            int d = 0;
            for (int j = 0; j < 4; j++) {
                if(arr1[c] == arr2[d]) result = arr1[c];
                d++;
            }
            c++;
        }

        System.out.println("최대공약수 = " + result);

        System.out.println("메인끝");

    } // end of main
}
