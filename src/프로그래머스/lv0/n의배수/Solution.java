package 프로그래머스.lv0.n의배수;

public class Solution {
    public static void main(String[] args) {
        int num = 34;       //98
        int n = 3;          //2

        int answer = 0;
        if (num % n == 0) {
            answer =1;
        }

        System.out.println(answer);

    }
}
