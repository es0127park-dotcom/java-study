package ex06;

class Data{ // hashCode 함수는 Object 클래스에 있음 -> extends Object 하지 않아도 디폴트로 들어가 있음(모든 클래스의 부모 Object)
    int num;

    public Data(int num) {
        this.num = num;
    }

    @Override
    public int hashCode() {
        return 9; // 9로 치면 9 return
    }
}

public class MyHash extends Object{
    public static void main(String[] args) {
        Data d1 = new Data(1);
        Data d2 = new Data(1); // d1과 d2의 상태는 같지만 주소는 다름 -> 다른 데이터
        Data d3 = d1; // 얕은 복사(주소만 복사)

        System.out.println(d1.hashCode()); // hashCode는 주소를 반환하는 것
        System.out.println(d2.hashCode());

        if (d1.hashCode() == d2.hashCode()){
            System.out.println("같은 주소에 있는 객체"); // 주소가 같으면 상태(값)도 같음
        }else {
            System.out.println("다른 주소에 있는 객체"); // 주소 달라도 상태(값)은 같을 수 있음
        }

        if(d1.num == d2.num){
            System.out.println("값이 같습니다.");
        }else {
            System.out.println("값이 다릅니다.");
        }
        
        if(d1.hashCode() == d3.hashCode()){
            System.out.println("같아요!! 얕은복사 됐어요");
        }else {
            System.out.println("달라요!! new가 된 다른 주소 같아요");
        }
    }
}
