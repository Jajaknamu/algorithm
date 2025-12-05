class Solution {
    public int solution(int i, int j, int k) {

        String strK = Integer.toString(k);
        int result = 0;

        for (int a = i; a <= j; a++) {
            String num = Integer.toString(a);
            for (int idx =0; idx<num.length(); idx++) {
                if(num.charAt(idx)==strK.charAt(0)) {
                    result ++;
                }
            }
        }
        return result;
    }
}