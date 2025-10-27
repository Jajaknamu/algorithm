import java.util.*;
class Solution {
    public int solution(int[] sides) {
        int answer = 0;
        int answer2 = 0;
        
        Arrays.sort(sides);
        //주어진 배열에서 가장 긴 변의 길이가 있는 경우
        for(int i=0; i<sides[1]+1; i++){
            if(sides[0] + i > sides[1]){
                answer ++;
            }
        }
        //주어진 배열이 아닌 다른 한 변의 길이가 가장 긴 경우
        for(int i=0; i<10000; i++){
            if(sides[0]+sides[1] > i && sides[1]<i){
                answer2 ++;
            }
        }
        return answer + answer2;
    }
}