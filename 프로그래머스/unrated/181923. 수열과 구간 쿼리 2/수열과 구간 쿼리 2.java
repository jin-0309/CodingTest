import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];
        List<Integer> arrList = new ArrayList<>();
        for (int num : arr) {
            arrList.add(num);
        }
        for (int i = 0; i<queries.length; i++) {
            int min = Integer.MAX_VALUE;
            
            for (int j = queries[i][0]; j<=queries[i][1]; j++) {
                int num = arrList.get(j);
                if (num < min && num > queries[i][2]) {
                    min = num;
                }
                
            }
            
            answer[i] = (min == Integer.MAX_VALUE) ? -1 : min;
        }
        return answer;
    }
}