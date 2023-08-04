package 프로그래머스.lv1.실패율;


import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Solution {

    public static void main(String[] args) {
        int N = 5;
        int[] stages = {2, 1, 2, 6, 2, 4, 3, 3};


//        int N = 4;
//        int[] stages = {4,4,4,4,4};

        int runner = stages.length;
        Map<Integer, Double> failData = new HashMap<>();

        for (int i = 1; i < N + 1; i++) {
            int loser = 0;
            for (int no : stages) {
                if (i == no) {
                    loser++;
                }
            }

            if (loser == 0) {
                failData.put(i, 0.0);
            } else {
                failData.put(i, (double) loser / (double) runner);
                runner = runner - loser;
            }
        }

        List<Integer> keys = new ArrayList<>(failData.keySet());
        Collections.sort(keys, (v1, v2) -> (failData.get(v2).compareTo(failData.get(v1))));

        int[] answer = keys.stream().mapToInt(i -> i).toArray();

        for (int i : answer) {
            System.out.println("i :" + i);
        }

    }

}
