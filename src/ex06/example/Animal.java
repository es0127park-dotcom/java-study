package ex06.example;

public class Animal {
    void sound(){

    }
    void introduce(){

    }
    void act(){

    }
}

class Dog extends Animal {
    private String name;

    Dog(String name){
        this.name = name;
    }

    void introduce(){
        System.out.println("제 이름은 " + name + "입니다.");
    }
    void sound(){
        System.out.println("멍멍!");
    }
    void act(){
        System.out.println("꼬리를 흔든다");
    }
}

class Cat extends Animal {
    private String name;

    Cat(String name){
        this.name = name;
    }

    void introduce(){
        System.out.println("제 이름은 " + name + "입니다.");
    }
    void sound(){
        System.out.println("야옹~");
    }
    void act(){
        System.out.println("할퀸다");
    }
}

class Duck extends Animal {
    private String name;

    Duck(String name){
        this.name = name;
    }

    void introduce(){
        System.out.println("제 이름은 " + name + "입니다.");
    }
    void sound(){
        System.out.println("꽥꽥!");
    }
    void act(){
        System.out.println("헤엄친다");
    }
}
