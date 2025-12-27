class Solution {
    public int solution(String A, String B) {
 // 1. 안 밀어도 똑같은 경우 (0 반환)
    if (A.equals(B)) {
        return 0;
    }

    String tempA = A;

    // 2. A의 길이만큼 뱅글뱅글 돌려보기
    for (int i = 0; i < A.length(); i++) {
        String lastChar = tempA.substring(tempA.length() - 1);
        String lest = tempA.substring(0, tempA.length() - 1);
        tempA = lastChar + lest;

        // 3. 한 번이라도 밀어서 B가 되면? (묻지도 따지지도 말고 1 반환!)
        if (tempA.equals(B)) {
            return i+1;
        }
    }

    // 4. 다 돌았는데 결국 못 만들면 (-1 반환)
    return -1;
    }
}