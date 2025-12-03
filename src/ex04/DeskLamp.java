package ex04;

public class DeskLamp {
    // 인스턴스 변수 정의
    public boolean is0n;

    // 메소드 정의
    public void turnOn(){
        is0n = true;
    }
    public void turnoff(){
        is0n = false;
    }
    public String toString() {
        return "현재 상태는 " + (is0n == true ? "켜짐" : "꺼짐");
    }
}
