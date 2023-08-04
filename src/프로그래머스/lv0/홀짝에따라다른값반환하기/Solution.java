package 프로그래머스.lv0.홀짝에따라다른값반환하기;

public class Solution {
    public static void main(String[] args) {
        int n = 10;

        int answer = 0;

        for (int i = 0; i <= n; i++) {
            if (n % 2 == 0 && i%2==0) {
                answer += i*i;
            } else if (n % 2 == 1 && i % 2 == 1) {
                answer += i;
            }
        }

        System.out.println(answer);

    }
}
