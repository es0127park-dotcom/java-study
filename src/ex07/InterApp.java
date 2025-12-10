package ex07;

// can do (할 수 있는 것만 정의해줌)
interface 리모컨이할수있는것 {
    public abstract void power();
}

abstract class 리모컨 implements 리모컨이할수있는것 {
    private boolean power;

    public 리모컨() {
        this.power = false;
    }
    
    public void power(){
        this.power = !this.power;  // !는 부정연산자
    }

    public boolean isPower() {  // getPower -> boolean타입은 isPower
        return power;
    }
}

class 엘지리모컨 extends 리모컨 {  // extends할 경우 super();는 기본생성자에 자동으로 들어가있음
    
}

class 삼성리모컨 extends 리모컨 {
    
}

// 인터페이스 (상하관계의 약속)
public class InterApp {
    public static void main(String[] args) {
        리모컨 r1 = new 삼성리모컨();
        System.out.println(r1.isPower());
        r1.power(); // 켜다
        System.out.println(r1.isPower());
        r1.power(); // 끄다
        System.out.println(r1.isPower());
        
    }
}
