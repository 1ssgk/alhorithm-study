package 프로그래머스.lv1.공원산책;


public class Solution {

    public static void main(String[] args) {

        String [] park = {"OSO","OOO","OXO","OOO"}; //{"SOO","OOO","OOO"};
        String [] routes = {"E 2","S 3","W 1"}; //{"E 2", "S 2", "W 1"};

        int sx = 0;
        int sy = 0;

        // 지도 사이즈 측정
        char[][] arr = new char[park.length][park[0].length()];

        // 지도 그리기
        for (int i = 0; i < park.length; i++) {
            arr[i] = park[i].toCharArray();

            if (park[i].contains("S")) {
                sy = i;
                sx = park[i].indexOf("S");
            }
        }

        for (String str : routes) {
            String [] info = str.split(" ");
            String direction = info[0];
            int length = Integer.parseInt(info[1]);
            int nx = sx;
            int ny = sy;

            for (int i = 0; i < length; i++) {

                if (direction.equals("E")) {
                    nx++;
                }
                if (direction.equals("W")) {
                    nx--;
                }
                if (direction.equals("S")) {
                    ny++;
                }
                if (direction.equals("N")) {
                    ny--;
                }

                if (nx >= 0 && ny >= 0 && ny < arr.length && nx < arr[0].length) {
                    // 현재 이동한 지점에 장애물이 있으면 이동 취소
                    if (arr[ny][nx] == 'X') {
                        break;
                    }

                    // 범위내 & 장애물 없으면
                    if (i == length - 1) {
                        sx = nx;
                        sy = ny;
                    }
                }
            }
        }

        int [] answer = {sy, sx};

    }

}
