package ex08;

class Circle3{
    int radius;
    public Circle3(int radius){
        this.radius = radius;
    }
    public boolean equals(Circle3 c1){
        if(radius == c1.radius) {
            return true;
        } else {
            return false;
        }
    }
}

public class CircleTest3 {
    public static void main(String[] args) {
        Circle3 obj1 = new Circle3(10);
        Circle3 obj2 = new Circle3(10);

        if(obj1.equals(obj2)){
            System.out.println("2개의 원은 같습니다.");
        } else {
            System.out.println("2개의 원은 같지 않습니다.");
        }
    }
}
