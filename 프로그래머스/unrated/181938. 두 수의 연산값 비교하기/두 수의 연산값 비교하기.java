class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String temp = "";
        temp += a;
        temp += b;
        int x = Integer.parseInt(temp);
        int y = 2 * a * b;
        
        if (x > y) {
            answer = x;
        } else {
            answer = y;
        }
        
        return answer;
    }
}