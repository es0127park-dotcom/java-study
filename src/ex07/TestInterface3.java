package ex07;

class Shape3 {
    protected int x, y;
}

interface Drawable {
    void draw();
}

class Circle3 extends Shape3 implements Drawable {
    int radius;
    public void draw() {
        System.out.println("Circle Draw at (" + x + ", " + y + ")");
    }
}

public class TestInterface3 {
    public static void main(String[] args) {
        Drawable obj = new Circle3();
        obj.draw();
    }
}
