import java.util.*;

class Solution {
    public String[] solution(String my_string) {
        List<String> answer = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++) {
            answer.add(my_string.substring(i, my_string.length()));
        }
        Collections.sort(answer);
        
        String[] result = new String[answer.size()];
        result = answer.toArray(result);
        
        return result;
    }
}