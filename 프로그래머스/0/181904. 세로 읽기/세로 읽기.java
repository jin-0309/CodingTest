class Solution {
    public String solution(String my_string, int m, int c) {
        StringBuilder answer = new StringBuilder();
        char[][] chararr = new char[my_string.length()/m][m];
        char[] my_charArr = my_string.toCharArray();
        int index = 0;
        
        for (int i=0; i<my_string.length()/m; i++) {
            for (int j=0; j<m; j++) {
                chararr[i][j] = my_charArr[index++];
            }
        }
        
        for (int i=0; i<my_string.length()/m; i++) {
            answer.append(chararr[i][c-1]);
        }
        return answer.toString();
    }
}