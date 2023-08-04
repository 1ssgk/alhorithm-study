package 프로그래머스.lv0.문자리스트를문자열로변환하기;

import java.util.Arrays;
import java.util.stream.Collectors;

public class Solution {
    public static void main(String[] args) {
        String[] arr = new String[]{"a", "b", "c"};

        String answer = Arrays.stream(arr).collect(Collectors.joining());


        System.out.println(answer);
        System.out.println("---------------------------");

        String answer2 = String.join("",arr);
        System.out.println(answer2);



    }
}
