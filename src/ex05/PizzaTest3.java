package ex05;

public class PizzaTest3 {
    public static void main(String[] args) {
        Pizza3 p1 = new Pizza3("Super Supreme");
        Pizza3 p2 = new Pizza3("Cheese");
        Pizza3 p3 = new Pizza3("Pepperoni");
        int n = Pizza3.count;
        System.out.println("지금까지 판매된 피자 개수 = " + n);
    }
}
