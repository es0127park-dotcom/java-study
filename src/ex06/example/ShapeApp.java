package ex06.example;

class Shape{
    void draw(){
        System.out.println("도형을 그립니다.");
    }
}

class Circle extends Shape {
    void draw(){
        System.out.println("원을 그립니다.");
    }
}

class Rectangle extends Shape {
    void draw(){
        System.out.println("사각형을 그립니다.");
    }
}

class Triangle extends Shape {
    void draw(){
        System.out.println("삼각형을 그립니다.");
    }
}

public class ShapeApp {
    public static void main(String[] args) {
        Shape[] arr = new Shape[3];
        arr[0] = new Circle();
        arr[1] = new Rectangle();
        arr[2] = new Triangle();

        for (int i = 0; i < arr.length; i++) {
            arr[i].draw();
        }

        System.out.println();

        for (Shape n : arr){
            n.draw();
        }
    }
}
