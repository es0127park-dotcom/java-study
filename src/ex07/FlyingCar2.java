package ex07;

interface Flyable {
    void fly();
}

class Car {
    int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }
}

public class FlyingCar2 extends Car implements Flyable {
    public void fly(){
        System.out.println("I'm flying!");
    }

    public static void main(String[] args) {
        FlyingCar2 obj = new FlyingCar2();
        obj.setSpeed(300);
        System.out.println(obj.getSpeed());
        obj.fly();
    }
}
