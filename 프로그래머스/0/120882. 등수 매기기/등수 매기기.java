class Solution {
    public int[] solution(int[][] score) {
        int n = score.length;
        double[] avg = new double[n];
        int[] rank = new int[n];

        // 1) 평균을 double로 계산
        for (int i = 0; i < n; i++) {
            avg[i] = (score[i][0] + score[i][1]) / 2.0;
        }

        // 2) 평균 기준 등수
        for (int i = 0; i < n; i++) {
            int cnt = 1;
            for (int j = 0; j < n; j++) {
                if (avg[i] < avg[j]) cnt++;
            }
            rank[i] = cnt;
        }

        return rank;
    }
}
