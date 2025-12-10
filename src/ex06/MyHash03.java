package ex06;

public class MyHash03 {
    public static void main(String[] args) {
        char[] arr = {'A','B','C'};

        int h = 0;

        // 스탭1. 문자를 숫자로 바꾼다.
        int n = arr[0]; // n = 65(A)

        h = h * 31 + n; // h = 65

        // 스탭2.
        n = arr[1]; // n = 66(B)
        h = h * 31 + n; // h = 2081

        // 스탭3.
        n = arr[2]; // n = 67(C)
        h = h * 31 + n; // h = 64578 (해시값)

        System.out.println(h);
    }
}
