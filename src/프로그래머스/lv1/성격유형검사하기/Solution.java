package 프로그래머스.lv1.성격유형검사하기;


public class Solution {

    public String main(String[] args) {
        String[] survey = {"AN", "CF", "MJ", "RT", "NA"};
        int[] choices = {5, 3, 2, 7, 5};

        // [필요]
        // 선택지에 따른 점수
        // 점수에 따른 선택지 구분
        // 기본 정보와 매칭하여 순서와 점수 대입


        String[] types = {"RT", "CF", "JM", "AN"};

        int[] total = new int[types.length];

        for (int i = 0; i < survey.length; i++) {

            int point = getPoint(choices[i]);

            String choiceType = "";
            if (choices[i] < 4) {
                choiceType = String.valueOf(survey[i].toCharArray()[0]);
            } else {
                choiceType = String.valueOf(survey[i].toCharArray()[1]);
            }

            setPoint(choiceType, point, total);
        }

        String answer = "";

        for (int i = 0; i < total.length; i++) {
            if (total[i] <= 0) {
                answer += String.valueOf(types[i].toCharArray()[0]);
            } else {
                answer += String.valueOf(types[i].toCharArray()[1]);
            }
        }

        System.out.println("result : " + answer);
        return answer;
    }

    public int getPoint(int i) {
        switch (i) {
            case 1:
            case 7:
                return 3;
            case 2:
            case 6:
                return 2;
            case 3:
            case 5:
                return 1;
            default:
                return 0;
        }
    }

    public void setPoint(String type, int point, int[] total) {
        switch (type) {
            case "R":
            case "T":
                total[0] = total[0] + (type.equals("T") ? point : -point);
                break;
            case "C":
            case "F":
                total[1] = total[1] + (type.equals("F") ? point : -point);
                break;
            case "J":
            case "M":
                total[2] = total[2] + (type.equals("M") ? point : -point);
                break;
            case "A":
            case "N":
                total[3] = total[3] + (type.equals("N") ? point : -point);
                break;
        }
    }

}
