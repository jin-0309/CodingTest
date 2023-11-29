class Solution {
    public String solution(int[] numLog) {
        String answer = "";
        for (int i=1; i<numLog.length; i++) {
            int index = numLog[i] - numLog[i-1];
            if (index == 1) {
                answer += "w";
            } else if (index == -1) {
                answer += "s";
            } else if (index == 10) {
                answer += "d";
            } else {
                answer += "a";
            }
        }
        return answer;
    }
}