class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = 0;
        int x = a;
        for (boolean is : included) {
            if(is == true) {
                answer += x;
            }
            x += d;
        }
        return answer;
    }
}