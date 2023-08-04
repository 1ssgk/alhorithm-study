package 프로그래머스.lv0.대소문자바꿔서출력하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        // aBcDeFg

        String result = "";
        for (int i = 0; i < a.length(); i++) {
            char c = a.charAt(i);

            if(Character.isLowerCase(c)){
                result +=Character.toUpperCase(c);
            }else{
                result +=Character.toLowerCase(c);
            }
        }
        System.out.println(result);

    }
}
