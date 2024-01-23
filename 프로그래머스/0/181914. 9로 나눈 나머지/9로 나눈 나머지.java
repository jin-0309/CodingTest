class Solution {
    public int solution(String number) {
        int answer = 0;
        char[] numberList = number.toCharArray();
        for(char num : numberList) {
            answer += Character.getNumericValue(num);
        }
        return answer % 9;
    }
}