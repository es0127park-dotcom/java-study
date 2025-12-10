package ex07;

interface Drivable {
    void drive();
}

interface Flyable1 {
    void fly();
}

public class FlyingCar1 implements Drivable, Flyable1 {
    public void drive(){
        System.out.println("I'm driving");
    }
    public void fly(){
        System.out.println("I'm flying");
    }

    public static void main(String[] args) {
        FlyingCar1 obj = new FlyingCar1();
        obj.drive();
        obj.fly();
    }
}
