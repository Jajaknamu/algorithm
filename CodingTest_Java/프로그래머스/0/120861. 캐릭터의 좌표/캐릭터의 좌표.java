import javax.swing.*;

public class Solution {
    public int[] solution(String[] keyinput, int[] board) {
        int[] answer = {0,0};
        for (String s : keyinput) {
            switch (s) {
                case "left" ->{
                    if (answer[0] > -board[0] / 2) {
                        answer[0] --;
                    }
                }
                case "right" -> {
                    if (answer[0] < board[0] / 2) {
                        answer[0]++;
                    }
                }
                case "up" -> {
                    if (answer[1] < board[1] / 2) {
                        answer[1]++;
                    }
                }
                    case "down" -> {
                        if (answer[1] > -board[1] / 2) {
                            answer[1]--;
                        }
                    }
            }
        }
        return answer;
    }
}


