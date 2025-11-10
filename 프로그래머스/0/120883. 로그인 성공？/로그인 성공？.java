class Solution {
    public String solution(String[] id_pw, String[][] db) {
        
        String inputId = id_pw[0];
        String inputPw = id_pw[1];
        String answer = "fail"; 
        for (String[] member : db) {
            String memberId = member[0];
            String memberPw = member[1];
            
     
            if (inputId.equals(memberId)) {
                if (inputPw.equals(memberPw)) {
                    return "login";
                } else {
                    answer = "wrong pw";
                }
            }
        }

        return answer;
    }
}