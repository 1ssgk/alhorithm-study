package 프로그래머스.lv0.홀짝구분하기;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        Boolean chk = false;
        if(n%2 == 0){
            chk = true;
        }

        String str = chk ? "even" : "odd";
        System.out.printf("%d is "+str,n);

    }
}
