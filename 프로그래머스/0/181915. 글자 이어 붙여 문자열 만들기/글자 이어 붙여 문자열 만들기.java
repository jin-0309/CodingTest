class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        StringBuilder sb = new StringBuilder();
        char[] stringList = my_string.toCharArray();
        
        for(int i = 0; i < index_list.length; i++) {
            sb.append(stringList[index_list[i]]);
        }
        
        answer = sb.toString();
        
        return answer;
    }
}