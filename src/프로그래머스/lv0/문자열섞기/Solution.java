package 프로그래머스.lv0.문자열섞기;

public class Solution {

    public static void main(String[] args){
        String str1 = "aaaaa";
        String str2 = "bbbbb";


        String answer = "";
        for (int i = 0; i < str1.length(); i++) {
            answer += str1.charAt(i);
            answer += str2.charAt(i);
        }

        System.out.println(answer);


    }
}
