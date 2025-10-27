class Solution {
    public int solution(int[][] lines) {
        // 범위 배열 (최대값을 고려하여 배열 크기 설정)
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // 구간의 최소값과 최대값 찾기
        for (int[] line : lines) {
            min = Math.min(min, line[0]);
            max = Math.max(max, line[1]);
        }

        // 최소, 최대 구간을 기준으로 배열 크기 설정
        int[] count = new int[max - min + 1]; 

        int answer = 0;

        // 각 구간에 해당하는 숫자 나열
        for (int[] line : lines) {
            for (int i = line[0]; i < line[1]; i++) {  // line[1]을 포함하지 않음
                count[i - min]++;  // 인덱스 보정 (min 값을 기준으로 맞추기)
            }
        }

        // 겹치는 숫자 찾기 (2번 이상 겹친 경우를 찾음)
        for (int i = 0; i < count.length; i++) {
            if (count[i] > 1) {
                answer++;
            }
        }
        
        return answer;
    }
}