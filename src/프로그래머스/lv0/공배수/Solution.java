package 프로그래머스.lv0.공배수;

public class Solution {
    public static void main(String[] args) {
        int number = 55;        //60
        int n = 10;              //2
        int m = 5;              //3

        int answer = number%n == 0 ? number%m == 0 ? 1 : 0 : 0;

        System.out.println(answer);
    }
}
