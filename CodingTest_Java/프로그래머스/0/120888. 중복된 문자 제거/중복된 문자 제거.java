class Solution {
    public String solution(String my_string) {
        String answer = "";
        
        for(int i=0; i<my_string.length(); i++) {
            //indexOf(): 문자열이 처음 나타나는 위치 반환 
            //my_string.charAt(i)값이 인덱스 값과 일치하면 중복된 문자x -> answer에 저장
            if(my_string.indexOf(my_string.charAt(i))==i){
                answer += my_string.charAt(i);
            }
        }
        return answer;
    }
}