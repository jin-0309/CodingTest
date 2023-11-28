class Solution {
    public int solution(int[] num_list) {
        int answer = 0;
        StringBuffer odd = new StringBuffer();
        StringBuffer even = new StringBuffer();
        
        for (int num : num_list) {
            if (num % 2 == 0) {
                even.append(num);
            } else {
                odd.append(num);
            }
        }
        answer = Integer.parseInt(odd.toString()) + Integer.parseInt(even.toString());
        return answer;
    }
}