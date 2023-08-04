package 프로그래머스.lv0.조건문자열;

public class Solution {
    public static void main(String[] args) {
        String ineq = ">";      // <
        String eq = "!";        // =
        int n = 41;             //20
        int m = 78;             //50

        int answer = 0;
        if (ineq.equals("<")) {
            if (eq.equals("=")) {
                answer = n <= m ? 1 : 0;
            }else{
                answer = n < m ? 1 : 0;
            }
        } else {
            if (eq.equals("=")) {
                answer = n >= m ? 1 : 0;
            }else{
                answer = n > m ? 1 : 0;
            }
        }

        System.out.println(answer);
    }
}
