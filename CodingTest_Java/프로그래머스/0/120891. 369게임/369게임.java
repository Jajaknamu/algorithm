import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int order) {
        int answer = 0;
        // 숫자를 문자열로 변환하고 각 문자 하나하나를 배열로 변환한 후, 다시 정수 배열로 변환합니다.
        int[] arrOrder = Stream.of(String.valueOf(order).split(""))
                               .mapToInt(Integer::parseInt)
                               .toArray();
        // 배열의 모든 요소를 확인합니다.
        for (int i = 0; i < arrOrder.length; i++) {
            // 각 요소가 3, 6, 9 중 하나인 경우 카운트를 증가시킵니다.
            if (arrOrder[i] == 3 || arrOrder[i] == 6 || arrOrder[i] == 9) {
                answer++;
            }
        }
        return answer;
    }
}