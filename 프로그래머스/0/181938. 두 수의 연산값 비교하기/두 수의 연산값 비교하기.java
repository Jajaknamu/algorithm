class Solution {
    public int solution(int a, int b) {
       int answer = 0;

        String stringA = String.valueOf(a);
        String stringB = String.valueOf(b);
        String sumString1 = stringA + stringB;

        int sum1 = Integer.parseInt(sumString1); //a+b

        int num = 2 * a * b;

        if (sum1 > num) {
            answer = sum1;
        } else if (sum1 < num) {
            answer = num;
        } else if (sum1 == num) {
            answer =sum1;
        }
        return answer;
    }
}