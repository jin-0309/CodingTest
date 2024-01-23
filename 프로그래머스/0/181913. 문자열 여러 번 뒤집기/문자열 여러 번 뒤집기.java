class Solution {
    public String solution(String my_string, int[][] queries) {
        StringBuilder answer = new StringBuilder(my_string);
        
        for(int[] query : queries) {
            String reverse =  answer.substring(query[0], query[1]+1);
            reverse = new StringBuilder(reverse).reverse().toString();
            answer.replace(query[0], query[1]+1, reverse.toString());
        }
        
        return answer.toString();
    }
}