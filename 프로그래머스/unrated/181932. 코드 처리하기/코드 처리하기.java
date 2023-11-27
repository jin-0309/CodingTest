class Solution {
    public String solution(String code) {
        String answer = "";
        boolean mode = true;
        for (int i = 0; i<code.length(); i++) {
            if (code.charAt(i) == '1') {
                if (mode == true) {
                    mode = false;
                } else {
                    mode = true;
                }
            }
            if (mode == true) {
                if (i % 2 == 0 && code.charAt(i) != '1') {
                    answer += code.charAt(i);
                }
            } else if (mode == false) {
                if (i % 2 != 0 && code.charAt(i) != '1') {
                    answer += code.charAt(i);
                }
            }
        }        
        if (answer.length() == 0) {
            answer = "EMPTY";
        }
        return answer;
    }
}