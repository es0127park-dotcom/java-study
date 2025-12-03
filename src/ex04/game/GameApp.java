package ex04.game;

public class GameApp {

    // 책임 : u1 -> u2 공격
    static void start(Zealot u1, Dragoon u2){
        u2.hp = u2.hp - u1.attack;
    }

    static void start(Dragoon u1, Zealot u2){  // 함수 이름 같아도 매개변수 다르면 다른 함수로 인식 -> 오버로딩
        u2.hp = u2.hp - u1.attack;
    }

    static void start(Zealot u1, Zealot u2){
        u2.hp = u2.hp - u1.attack;
    }

    public static void main(String[] args) {
        Zealot z1 = new Zealot();
        Zealot z2 = new Zealot();
        Dragoon d1 = new Dragoon();

        start(z1,d1);

        // 1. 드라군의 상태확인
        System.out.println(d1.hp);

        start(d1,z1);

        // 2. 질럿의 상태확인
        System.out.println(z1.hp);

        start(z1,z2);
        System.out.println(z2.hp);

        System.out.println();   // 오버로딩의 장점
        System.out.println(1);
        System.out.println("");
        System.out.println(1.2);
        System.out.println(true);
    }
}
