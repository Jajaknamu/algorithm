import java.util.*;
class Solution {
    public String solution(String my_string) {
        String lowcase = my_string.toLowerCase(Locale.ROOT);
        
        char[] arr = lowcase.toCharArray();
        Arrays.sort(arr);
        String answer = new String(arr);
        return answer;
    }
}