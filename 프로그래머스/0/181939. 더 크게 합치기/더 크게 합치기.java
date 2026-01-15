class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String stringA = String.valueOf(a);
        String stringB = String.valueOf(b);
        String sumString1 = stringA + stringB;
        String sumString2 = stringB + stringA;

        int sum1 = Integer.parseInt(sumString1);
        int sum2 = Integer.parseInt(sumString2);

        if (sum1 > sum2) {
            answer = sum1;
        } else {
            answer = sum2;
        }
        return answer;
    }
}