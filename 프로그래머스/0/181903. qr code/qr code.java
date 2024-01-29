class Solution {
    public String solution(int q, int r, String code) {
        String answer = "";
        char[] charArr = code.toCharArray();
        
        for (int i=0; i<code.length(); i++) {
            if (i%q == r) {
                answer += charArr[i];
            }
        }
        
        return answer;
    }
}