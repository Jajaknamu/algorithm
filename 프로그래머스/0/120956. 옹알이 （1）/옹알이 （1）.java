class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        // 조카가 할 수 있는 발음 목록
        String[] targets = {"aya", "ye", "woo", "ma"};
        
        // babbling 배열의 각 단어(word)를 하나씩 검사
        for (String word : babbling) {
            
            // 1. 발음의 중복 사용 여부 검사 (핵심!)
            // "ayaaya", "woowoo" 같은 단어는 발음할 수 없음.
            // target 배열에 있는 단어를 '연속해서' 두 번 포함하는지 확인
            if (word.contains("ayaaya") || word.contains("yeye") || 
                word.contains("woowoo") || word.contains("mama")) {
                continue; // 중복 발음이 있다면 다음 단어로 넘어감
            }
            
            // 2. 발음 가능한 단어를 특수 문자(예: 공백 " ")로 치환
            // 단어 안에 발음 가능한 부분이 있다면, 그 부분을 공백 한 칸으로 바꿔버려.
            for (String target : targets) {
                word = word.replace(target, " ");
            }
            
            // 3. 남은 공백을 제거
            // "aya ma" -> " " -> "" (공백 제거)
            word = word.replace(" ", "");
            
            // 4. 최종 검사
            // 발음 가능한 부분들을 공백으로 치환하고 남은 공백까지 제거했는데
            // 최종 문자열이 "" (빈 문자열)이라면, 이 단어는 조카가 발음할 수 있는 단어임!
            if (word.length() == 0) {
                answer++;
            }
        }
        
        return answer;
    }
}