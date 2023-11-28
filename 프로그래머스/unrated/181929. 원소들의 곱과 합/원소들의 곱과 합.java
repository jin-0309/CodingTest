class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        int x = 0;
        int y = 0;
        
        for (int num : num_list) {
            x *= num;
            if (x == 0) {
                x = num_list[0];
            }
            y += num;
        }
        
        if (x < y*y) {
            answer = 1;
        }
        
        return answer;
    }
}