package ex06.game;

class Protoss {
    public int getHp() {
        return -1;
    }

    public void setHp(int hp) {

    }

    public int getAttack() {
        return -1;
    }

    public void setAttack(int attack) {

    }
}

class River extends Protoss {
    private int hp = 100;
    private int attack = 50;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}

class Zealot extends Protoss {
    private int hp = 100;
    private int attack = 10;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}

class Dragoon extends Protoss {
    private int hp = 100;
    private int attack = 5;

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}

public class Game {

    static void start(Protoss u1, Protoss u2){
        // u2에 hp를 u1의 attack만큼 빼기
        u2.setHp(u2.getHp()-u1.getAttack());
    }

    public static void main(String[] args) {
        Protoss u1 = new River();
        Protoss u2 = new Zealot();
        Protoss u3 = new Dragoon();

        start(u1,u1); // 리버 -> 리버 / 리버 50
        start(u1,u2); // 리버 -> 질럿 / 질럿 50
        start(u1,u3); // 리버 -> 질럿 / 질럿 50
        
        System.out.println(u1.getHp());  // 리버
        System.out.println(u2.getHp());  // 질럿
        System.out.println(u3.getHp());  // 드라군
        
        start(u2,u1); // 질럿 -> 리버 / 리버 40
        start(u2,u2); // 질럿 -> 질럿 / 질럿 40
        start(u2,u3); // 질럿 -> 드라군 / 드라군 40

        System.out.println(u1.getHp());  // 리버
        System.out.println(u2.getHp());  // 질럿
        System.out.println(u3.getHp());  // 드라군

        start(u3,u1); // 드라군 -> 리버 / 리버 35
        start(u3,u2); // 드라군 -> 질럿 / 질럿 35
        start(u3,u3); // 드라군 -> 드라군 / 드라군 35

        System.out.println(u1.getHp());  // 리버
        System.out.println(u2.getHp());  // 질럿
        System.out.println(u3.getHp());  // 드라군

    }
}
