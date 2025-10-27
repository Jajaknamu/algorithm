import java.util.*;
public class Solution {
    public int solution(int[][] board) {
        int answer = 0;
        int[] dx = {-1, 0, 1, -1, 1, -1, 0, 1};
        int[] dy = {1, 1, 1, 0, 0, -1, -1, -1};
        ArrayList<int[]> mine = new ArrayList<>();

        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 1) {
                    int[] temp = {i, j};
                    mine.add(temp);
                }
            }
        }
        for (int i = 0; i < mine.size(); i++) {
            int a = mine.get(i)[0];
            int b = mine.get(i)[1];
            for (int j = 0; j < 8; j++) {
                if (dx[j] + a >= 0 && dy[j] + b >= 0 && dx[j] + a <= board.length - 1 && dy[j] + b <= board.length - 1) {
                    board[dx[j] + a][dy[j] + b] = 1;
                }
            }
        }
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == 0) {
                    answer++;

                }
            }
        }
        return answer;
    }
}