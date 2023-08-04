package 프로그래머스.lv1.개인정보수집유효기간;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Solution {

    public int[] solution() {
        String today = "2022.05.19";
        String[] terms = {"A 6", "B 12", "C 3"};
        String[] privacies = {"2021.05.02 A", "2021.07.01 B", "2022.02.19 C", "2022.02.20 C"};

        List<Integer> expired = new ArrayList<>();

        // 타입에 따른 유효기간 정보
        Map<String, Integer> termsMap = Arrays.stream(terms)
                .map(str -> str.split(" "))
                .collect(Collectors.toMap(s -> s[0], s -> Integer.parseInt(s[1])));

        int now = getDays(today);

        for (int i = 0; i < privacies.length; i++) {
            int pDay = getDays(privacies[i].split(" ")[0]);
            int term = termsMap.get(privacies[i].split(" ")[1]) * 28;

            if (pDay + term <= now) {
                expired.add(i + 1);
            }
        }

        int[] answer = expired.stream().sorted().mapToInt(i -> i).toArray();

        return answer;
    }

    public int getDays(String date) {
        int y = Integer.parseInt(date.split("\\.")[0]);
        int m = Integer.parseInt(date.split("\\.")[1]);
        int d = Integer.parseInt(date.split("\\.")[2]);

        return d + 28 * m + 28 * 12 * (y - 2000);
    }

}
