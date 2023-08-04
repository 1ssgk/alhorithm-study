package 프로그래머스.lv0.더크게합치기;

public class Solution {
    public static void main(String[] args) {
        int a = 89;  //9
        int b = 8; //91

        String abStr = String.valueOf(a)+String.valueOf(b);
        String baStr = String.valueOf(b)+String.valueOf(a);

        int answer = Integer.parseInt(abStr);
        if (answer < Integer.parseInt(baStr)) {
            answer = Integer.parseInt(baStr);
        }

        System.out.println(answer);
        System.out.println("------------------------");

        int answer2 = Math.max(Integer.parseInt(abStr), Integer.parseInt(baStr));

        System.out.println(answer2);

    }
}
