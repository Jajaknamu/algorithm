public class Solution {
    public String solution(String my_string){
        String answer = "";
        char tmp;
        for (int i = 0; i < my_string.length(); i++) {
            tmp = my_string.charAt(i);

            if ((65 <= tmp) && (90 >= tmp)) {
                answer += my_string.valueOf(tmp).toLowerCase();
            } else if ((97 <= tmp) && (122 >= tmp)) {
                answer += my_string.valueOf(tmp).toUpperCase();
            }
        }
        return answer;
    }
}
