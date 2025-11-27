class Solution {
    public String solution(String bin1, String bin2) {
        String answer = "";
        int radix1;
        int radix2;
        radix1 = Integer.parseInt(bin1,2);
        radix2 = Integer.parseInt(bin2,2);

        int result = 0;
        result = radix1 + radix2;
        answer = Integer.toBinaryString(result);
        return answer;
    }
}