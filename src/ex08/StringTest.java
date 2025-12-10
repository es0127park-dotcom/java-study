package ex08;

public class StringTest {
    public static void main(String[] args) {
        String s = "Hello World!";

        int size = s.length(); // 문자열의 길이
        System.out.println(size);

        char c = s.charAt(0); // 0번지 문자 추출
        System.out.println(c);

        String result = "A chain" + " is only as strong" + "as its weakest link";
        System.out.println(result);

        String s1 = "Java";
        String s2 = "Java";
        String s3 = new String("Java");
        String s4 = new String("Java");

        System.out.println(s1.equals(s2)); // true, 올바른 방법
        System.out.println(s1.equals(s3)); // true, 올바른 방법
        System.out.println(s1==s2);        // true지만 올바르지 않은 방법
        System.out.println(s1==s3);        // false, 올바르지 않은 방법

        String a = "The cat is on the table";
        int index = a.indexOf("table");

        if(index == -1){
            System.out.println("table은 없습니다.");
        } else {
            System.out.println("table의 위치 : " + index);
        }

        String[] tokens1 = "I am a boy.".split(" ");
        for (String token : tokens1){
            System.out.println(token);
        }

        String[] tokens2 = "100,200,300".split(",");
        for (String token : tokens2){
            System.out.println(token);
        }

        StringBuffer b = new StringBuffer("Happiness depends upon ourselves");

        StringBuffer sb = new StringBuffer("Hello");
        int length = sb.length();
        int capacity = sb.capacity();
        System.out.println("현재 문자열 길이 : " + length + " / 버퍼의 총 크기 : " + capacity);

        StringBuffer sb1 = new StringBuffer("10+20=");
        sb1.append(10+20);
        sb1.insert(0,"수식 ");
        System.out.println(sb1);
    }
}
