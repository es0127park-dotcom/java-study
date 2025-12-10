package ex06.example;

public class Zookeeper {

    void action(Animal a){
        a.introduce();
        a.sound();
        a.act();
        System.out.println();
    }

    public static void main(String[] args) {
        Animal[] arr = new Animal[3];
        arr[0] = new Dog("콩이");
        arr[1] = new Cat("나비");
        arr[2] = new Duck("덕돌이");

        Zookeeper a1 = new Zookeeper();

        for (int i = 0; i < arr.length; i++) {
            a1.action(arr[i]);
        }

        System.out.println();

        for (Animal n : arr){
            a1.action(n);
        }
    }
}
