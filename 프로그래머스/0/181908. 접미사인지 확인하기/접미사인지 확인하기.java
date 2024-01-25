import java.util.*;

class Solution {
    public int solution(String my_string, String is_suffix) {
        int answer = 0;
        
        List<String> strList = new ArrayList<>();
        
        for(int i=0; i<my_string.length(); i++) {
            strList.add(my_string.substring(i, my_string.length()));
        }
        
        if(strList.contains(is_suffix)) {
            return 1;
        } else {
            return 0;
        }
    }
}