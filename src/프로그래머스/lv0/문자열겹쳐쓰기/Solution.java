package 프로그래머스.lv0.문자열겹쳐쓰기;


public class Solution {
    public static void main(String[] args) {

        String my_string = "Program29b8UYP";  // 초기 문자열
        String overwrite_string = "merS123"; // 변경될 문자열
        int s = 7;  // 시작지점

        String answer = my_string.substring(0, s) + overwrite_string;

        if(my_string.length() > answer.length()) {
            answer += my_string.substring(answer.length());
        }
        System.out.println(answer);

    }
}
