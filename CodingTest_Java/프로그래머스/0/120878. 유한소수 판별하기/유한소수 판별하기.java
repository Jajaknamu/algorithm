class Solution {

    public int gcd(int a, int b) {
        if(b == 0) return a;
        return gcd(b, a % b);
    }


    public boolean check(int num) {
        while (num % 2 == 0) {
            num /= 2;
        }
        while (num % 5 == 0) {
            num /= 5;
        }

        return num == 1;
    }

    public int solution(int a, int b) {
        int answer = 0;

        int gcdValue = gcd(a, b);
        a /= gcdValue;
        b /= gcdValue;

        if (check(b)) {
            answer = 1;
        } else {
            answer = 2;
        }

        return answer;
    }
}