package ex04;

// add(+), minus(-), multi(*), divide(/)
public class Cal01 {
    
    static void add(int a, int b){             //void 중요! 생략불가
        System.out.println("a+b="+(a+b));
    }

    static void minus(int a, int b){
        System.out.println("a-b="+(a-b));
    }

    static void multi(int a, int b){
        System.out.println("a*b="+(a*b));
    }

    static void divide(int a, int b){
        System.out.println("a/b="+(a/b));
    }

    public static void main(String[] args) {
        add(3,5);   //static에 있는 것 "class이름.OO"로 불러 와야 함. 같은 파일에서는 생략 가능
        minus(10,7);
        multi(2,6);
        divide(16,4);
    }
}
