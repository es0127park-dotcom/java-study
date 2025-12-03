package ex04;

public class Tv01 {

    boolean status = false; // 상태 / 메인 전에 적으면 상태가 됨. 메인 안에 적으면 상태 아님.

    void on(){                // on을 실행하면 true로 상태가 변화 -> 메서드
        System.out.println("tv가 켜졌어요.");
        status = true; // 상태변경
    }

    void off(){               // off를 실행하면 false로 상태가 변화 -> 메서드
        System.out.println("tv가 꺼졌어요.");
        status = false;
    }

    public static void main(String[] args) {
        // 이 라인에서는 static만 떠있는 상태
        Tv01 tv = new Tv01(); // 객체(Object) 생성 / new class명() - static이 아닌 것들 메모리(힙이라는 공간)에 다 띄움
        System.out.println(tv.status);

        tv.on();
        System.out.println(tv.status);

        tv.off();
        System.out.println(tv.status);
    }
}
