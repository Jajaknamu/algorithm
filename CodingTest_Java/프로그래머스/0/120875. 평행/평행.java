class Solution {
    public int solution(int[][] dots) {
        // 점 0과 점 1 사이의 기울기
        if (checkSlope(dots[0], dots[1], dots[2], dots[3])) return 1;
        // 점 0과 점 2 사이의 기울기
        if (checkSlope(dots[0], dots[2], dots[1], dots[3])) return 1;
        // 점 0과 점 3 사이의 기울기
        if (checkSlope(dots[0], dots[3], dots[1], dots[2])) return 1;

        return 0;
    }

    // 기울기 비교 함수
    public boolean checkSlope(int[] dot1, int[] dot2, int[] dot3, int[] dot4) {
        // 두 직선의 기울기를 비교하는 방식
        return (dot1[1] - dot2[1]) * (dot3[0] - dot4[0]) == (dot1[0] - dot2[0]) * (dot3[1] - dot4[1]);
    }
}