class Solution {
    public int solution(int n, String control) {
        char[] arr = control.toCharArray();
        for (char c : arr) {
            if (c == 'w') {
                n = n + 1;
            } else if (c == 's') {
                n = n - 1;
            } else if (c == 'd') {
                n = n + 10;
            } else if (c == 'a') {
                n = n - 10;
            }
        }
        return n;
    }
}