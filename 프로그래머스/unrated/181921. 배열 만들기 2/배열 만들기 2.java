import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
        for (int i = l; i<=r; i++) {
            boolean flag = true;
            String numStr = Integer.toString(i);
            for (char num : numStr.toCharArray()) {
                int isFive = num;
                if (isFive != '5' && isFive != '0') {
                    flag = false;
                }
            }
            if (flag == true) {
                list.add(i);
            }
        }
        if (list.size() == 0) {
            list.add(-1);
        }
        int[] answer = list.stream().mapToInt(Integer::intValue).toArray();
        return answer;
    }
}