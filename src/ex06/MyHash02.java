package ex06;

public class MyHash02 {
    public static void main(String[] args) {
        char c = 'A'; // char는 2바이트. 한글도 가능
        System.out.println(c);
        byte b = (byte)c; // 2바이트 A를 바이트로 다운캐스팅
        System.out.println(b); // A -> 아스키코드(65)

        byte b1 = 65;
        char c1 = (char) b1; // 타입이 완전 달라서 캐스팅 해줘야 함
        System.out.println(c1);
    }
}
