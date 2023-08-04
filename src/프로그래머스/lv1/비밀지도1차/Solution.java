package 프로그래머스.lv1.비밀지도1차;


public class Solution {

    public static void main(String[] args) {
//        int n = 5;
//        int[] arr1 = {9, 20, 28, 18, 11};
//        int[] arr2 = {30, 1, 21, 17, 28};

        int n = 6;
        int[] arr1 = {46, 33, 33 ,22, 31, 50};
        int[] arr2 = {27 ,56, 19, 14, 14, 10};

        String[] answer = new String[n];

        for (int i = 0; i < n; i++) {
            answer[i] = Integer.toBinaryString(arr1[i] | arr2[i]);
            answer[i] = "0".repeat(n - answer[i].length()) + answer[i];

            answer[i] = answer[i].replace("1","#");
            answer[i] = answer[i].replace("0"," ");
        }


    }

}
