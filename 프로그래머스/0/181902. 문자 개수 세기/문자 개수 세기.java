class Solution {
    public int[] solution(String my_string) {
        int[] answer = new int[52];
        char[] charArr = my_string.toCharArray();
        
        for(int i=0; i<52; i++) {
            answer[i] = 0;
        }
        
        for(int i=0; i<my_string.length(); i++) {
            if('A' <= charArr[i] && charArr[i] <= 'Z') {
                int alphabetNum = charArr[i] - 'A';
                answer[alphabetNum]++;
            } else {
                int alphabetNum = charArr[i] - 'a' + 26;
                answer[alphabetNum]++;
            }
        }
        return answer;
    }
}