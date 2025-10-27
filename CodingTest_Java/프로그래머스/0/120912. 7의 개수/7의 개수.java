
public class Solution {
    public int solution(int[] array) {
        int answer = 0;
        String result = changeString(array);
        String[] split = result.split("");

        for (int i = 0; i < split.length; i++) {
            if(split[i].equals("7")){
                answer ++;
            }
        }
        return answer;
    }

    public static String changeString(int[] arr) {
        StringBuilder sb = new StringBuilder();
        for (int num : arr) {
            sb.append(num);
        }
        return sb.toString();
    }
}