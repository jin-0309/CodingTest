import java.util.ArrayList;
import java.util.List;

class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> intList = new ArrayList<>();
        for(String str : intStrs) {
            String temp = str.substring(s, s+l);
            if (Integer.parseInt(temp) > k) {
                intList.add(Integer.parseInt(temp));
            }
        }
        int[] answer = new int[intList.size()];
        for(int i = 0; i < intList.size(); i++) {
            answer[i] = intList.get(i);
        }
        return answer;
    }
}