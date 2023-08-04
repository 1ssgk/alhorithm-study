package 프로그래머스.lv1.추억점수;

import java.util.HashMap;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        String[] name = {"may", "kein", "kain", "radi"};


        int[] yearning = {5, 10, 1, 3};
        String[][] photo = {{"may", "kein", "kain", "radi"}, {"may", "kein", "brin", "deny"}, {"kon", "kain", "may", "coni"}};

        int[] answer = new int[photo.length];

        // 점수 설정
        Map<String, Integer> pointMap = new HashMap();
        for (int i = 0; i < name.length; i++) {
            pointMap.put(name[i], yearning[i]);
        }

        // 계산
        for (int i = 0; i< photo.length; i++) {
            int score = 0;
            for (String str : photo[i]) {
                if(pointMap.containsKey(str)){
                    score += pointMap.get(str);
                }
            }
            answer[i] = score;
        }


    }

}
