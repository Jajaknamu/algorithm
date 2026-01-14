class Solution {
    public String solution(String[] arr) {
        String answer = "";

        char[] ch = new  char[arr.length];
        for (int i = 0; i < arr.length; i++) {
           ch[i] = arr[i].charAt(0);
        }
        answer = String.valueOf(ch);

        return answer;
    }
}