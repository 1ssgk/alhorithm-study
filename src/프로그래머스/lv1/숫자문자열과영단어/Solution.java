package 프로그래머스.lv1.숫자문자열과영단어;


public class Solution {

    public static void main(String[] args) {

        String s = "one4seveneight";

        String[] arr = {"zero", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine"};

        for (int i = 0; i < arr.length; i++) {
            if (s.contains(arr[i])) {
                s = s.replace(arr[i], Integer.toString(i));
            }
        }

        System.out.println("result = " + s);

        Integer.parseInt(s);

    }

}
