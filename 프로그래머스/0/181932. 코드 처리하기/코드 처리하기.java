import java.util.ArrayList;

class Solution {
    public String solution(String code) {
         String answer = "";
        String[] split = code.split("");
        ArrayList<String> list = new ArrayList<>();

         int mode = 0;

         for (int i = 0; i < split.length; i++) {
             if (split[i].equals("1")) {
                 mode = 1 - mode;
                 continue;
             }
             if (mode == 0 && i % 2 == 0) {
                 list.add(split[i]);
             } else if (mode == 1 && i % 2 == 1) {
                 list.add(split[i]);
             }
         }
         
        answer = String.join("", list);
        if (list.isEmpty()) {
            answer = "EMPTY";
        }
        return answer;
    }
}