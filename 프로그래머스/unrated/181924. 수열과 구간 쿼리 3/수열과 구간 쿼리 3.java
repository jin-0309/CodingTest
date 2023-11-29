class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = arr;
        for (int[] query : queries) {
            int temp = arr[query[0]];
            arr[query[0]] = arr[query[1]];
            arr[query[1]] = temp;
        }
        return answer;
    }
}