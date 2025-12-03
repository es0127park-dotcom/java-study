package ex04;

public class People {

    private String name;  // 이름
    private int height;   // 키
    private int weight;   // 무게

    People(String name, int height, int weight){  // 생성자(앞에 void나 int 못 붙임) / 역할:객체의 초기화
        this.name = name;           // 매개변수의 name과 헷갈리기 때문에 this를 붙여줘야 함
        this.height = height;
        this.weight = weight;
    }

    // 상태변경
    public void 밥먹기(){
        weight = weight + 2;        // 이건 매개변수에 weight가 없기 때문에 this 안 적어도 됨
    }

    // 상태확인
    public int getWeight(){
        return weight;
    }

}
