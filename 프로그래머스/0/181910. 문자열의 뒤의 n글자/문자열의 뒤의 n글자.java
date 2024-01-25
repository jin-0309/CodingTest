class Solution {
    public String solution(String my_string, int n) {
        StringBuilder answer = new StringBuilder(my_string);
        answer.reverse();
        
        answer = new StringBuilder(answer.substring(0, n));
        
        answer.reverse();
        
        return answer.toString();
    }
}