package ex06.game;

public class GameApp {

    // 책임 : u1 -> u2 공격
    static void start(Protoss u1, Protoss u2){
        // u2.hp = u2.hp - u1.attack;
        int remainHp = u2.getHp() - u1.getAttack();
        u2.setHp(remainHp);
    }

    public static void main(String[] args) {
        Zealot z1 = new Zealot();
        Zealot z2 = new Zealot();
        Dragoon d1 = new Dragoon();
        River r1 = new River();

        start(z1,d1);

        // 1. 드라군의 상태확인
        System.out.println(d1.getHp());

        start(d1,z1);

        // 2. 질럿의 상태확인
        System.out.println(z1.getHp());

        start(z1,z2);
        System.out.println(z2.getHp());

    }
}
