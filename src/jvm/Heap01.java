package jvm;

class Student {
    int no;   // 메모리에 뜨면 Heap에 뜰 것! static이 안붙어 있으니까!
    String name;
    int age;
    static String school = "그린아카데미";

    void setNo(int no){
        this.no = no;   // 그냥 no는 setNo스택에 있는 no / this.가 붙으면 setNo 호출되는 Heap에 있는 no 호출
    }

    // 책임 : 상태 확인
    void show(){
        System.out.println(no);
        System.out.println(name);
        System.out.println(age);
        System.out.println(school);
        System.out.println();
    }
}

public class Heap01 {

    static int num = 10;

    public static void main(String[] args) {
        Student s1 = new Student();
        s1.no = 1;
        s1.name = "홍길동";
        s1.age = 20;
        s1.show();

        Student s2 = new Student();
        s2.no = 2;
        s2.name = "장보고";
        s2.age = 20;
        s2.show();

        s2.setNo(5);  // 장보고 번호 변경
        s2.show();

        System.out.println(Heap01.num);
    }
}
