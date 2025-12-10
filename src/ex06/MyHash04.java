package ex06;

import java.util.HashMap;

public class MyHash04 {
    public static void main(String[] args) {
        HashMap<String, String> arr = new HashMap<>();
        arr.put("age","1"); // 크기 1의 배열이 만들어짐 키로 밸류를 찾음
        arr.put("name","임꺽정"); // 크기 2의 배열이 만들어짐

        System.out.println(arr.get("name"));
    }
}
