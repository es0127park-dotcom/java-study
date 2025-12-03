package ex04;

// OOP : Object Oriented Programing(객체 지향 프로그래밍)
// 1원칙 : 상태는 행위를 통해 변경한다. (상태에 직접적으로 접근하지 않고 행위를 통해 변경할 수 있게 무조건 private / 행위에는 public)
public class PeopleApp {
    public static void main(String[] args) {
        People people1 = new People("홍길동", 30, 5);
        People people2 = new People("장보고", 20, 3);

        people1.밥먹기(); // 메서드(힙의 상태를 변경시키기 때문)
        people1.밥먹기(); // 메서드(힙의 상태를 변경시키기 때문)
        System.out.println(people1.getWeight());
    }
}
