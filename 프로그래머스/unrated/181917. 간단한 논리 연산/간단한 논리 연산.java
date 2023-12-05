class Solution {
    public boolean solution(boolean x1, boolean x2, boolean x3, boolean x4) {
        boolean answer = true;
        answer = calc2(calc1(x1, x2), calc1(x3, x4));
        return answer;
    }
    
    public boolean calc1(boolean x, boolean y) {
        if (x == false && y == false) {
            return false;
        }
        return true;
    }
    
    public boolean calc2(boolean x, boolean y) {
        if (x == true && y == true) {
            return true;
        }
        return false;
    }
}