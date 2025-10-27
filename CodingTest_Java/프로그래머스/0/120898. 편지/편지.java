import java.util.*;
class Solution {
    public int solution(String message) {
        int answer = 0;
        
        List<String> arr = Arrays.asList(message.split(""));
        for(int i =0; i<arr.size(); i++){
            answer ++;
        }
        return answer*2;
    }
}