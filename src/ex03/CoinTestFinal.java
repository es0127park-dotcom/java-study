package ex03;

/**
 * 동전 종류 : 500, 100, 50, 10 - 4가지 종류
 * money를 입력받아서 1200원
 * 각각의 동전의 최소 개수를 구할예정
 */
public class CoinTestFinal {
    public static void main(String[] args) {
        int money = 1270;
        int restMoney = money;
        int count;
        int [] moneys = {500,100,50,10};
        int i = -1;

        for (int j = 0; j < 4; j++) {
            i++;
            count = restMoney / moneys[i];
            restMoney = restMoney%moneys[i];
            System.out.println(moneys[i]+ "동전 개수 : "+count);
            System.out.println("남은 금액 : "+restMoney);
        }
    }
}