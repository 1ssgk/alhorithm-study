package 프로그래머스.lv0.두수의연산값비교하기;

public class Solution {

    public static void main(String[] args) {
        int a = 91;      //2
        int b = 2;     //91

        String abStr = String.valueOf(a) + String.valueOf(b);

        int answer = Integer.parseInt(abStr);
        if (answer < (2 * a * b)) {
            answer = 2 * a * b;
        }

        System.out.println(answer);

    }
}
