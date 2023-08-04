package 프로그래머스.lv1.달리기경주;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.IntStream;

public class Solution {

    public static void main(String[] args) {
        String[] players = {"mumu", "soe", "poe", "kai", "mine"};
        String[] callings = {"kai", "kai", "mine", "mine"};
        //String[] result = {"mumu", "kai", "mine", "soe", "poe"};

        String[] answer = {};

        Map<String, Integer> rankMap = new HashMap<>();

        // 현재 순위 확인
        IntStream.range(0, players.length).forEach(index -> {
            rankMap.put(players[index], index);
        });

        // 순위 변경
        Arrays.stream(callings).forEach(player -> {
            System.out.println("player : "+player);
            int i = rankMap.get(player);
            String frontPlayer = players[i - 1];
            players[i] = frontPlayer;
            players[i - 1] = player;

            rankMap.put(frontPlayer, i);
            rankMap.put(player, i - 1);
        });

        answer = players;

    }

}
