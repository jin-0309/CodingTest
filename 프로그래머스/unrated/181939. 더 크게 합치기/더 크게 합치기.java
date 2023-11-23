class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String tempa = "";
        String tempb = "";
        tempa += a;
        tempa += b; 
        tempb += b;
        tempb += a;
        if (Integer.parseInt(tempa) > Integer.parseInt(tempb)) {
            answer = Integer.parseInt(tempa);
        } else {
            answer = Integer.parseInt(tempb);
        }
        return answer;
    }
}