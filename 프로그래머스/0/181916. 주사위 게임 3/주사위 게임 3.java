class Solution {
    public int solution(int a, int b, int c, int d) {
        int answer = 0;
        if (a == b && b == c && c == d) {
            answer = 1111 * a;
        } else if (a == b && b == c || b == c && c == a || a == c && c == d || a == b && b == d || b == c && c == d) {
            int difnum = 0;
            int samenum = 0;
            if (a == b && b == c) {
                samenum = a;
                difnum = d;
            } else if (a == c && c == d) {
                samenum = a;
                difnum = b;
            } else if (a == b && b == d) {
                samenum = a;
                difnum = c;
            } else if (b == c && c == d) {
                samenum = b;
                difnum = a;
            }
            answer = (10 * samenum + difnum) * (10 * samenum + difnum);
        } else if (a == b && c == d ||
                   b == c && a == d ||
                   c == d && a == b ||
                   d == a && b == c ||
                   a == c && b == d ||
                   b == d && a == c) {
            int difnum1, difnum2;
            if (a != b) {
                difnum1 = a;
                difnum2 = b;
            } else if (a != c) {
                difnum1 = a;
                difnum2 = c;
            } else {
                difnum1 = a;
                difnum2 = d;
            }
            answer = (difnum1 + difnum2) * Math.abs(difnum1 - difnum2);
        } else if (a == b && c != d ||
                   a == c && b != d ||
                   a == d && b != c ||
                   b == d && a != c ||
                   b == c && a != d ||
                   c == d && a != b) {
            int difnum1 = 0;
            int difnum2 = 0;
            
            if (a == b) {
                difnum1 = c;
                difnum2 = d;
            } else if (a == c) {
                difnum1 = b;
                difnum2 = d;
            } else if (a == d) {
                difnum1 = b;
                difnum2 = c;
            } else if (b == d) {
                difnum1 = a;
                difnum2 = c;
            } else if (b == c) {
                difnum1 = a;
                difnum2 = d;
            } else if (c == d) {
                difnum1 = a;
                difnum2 = b;
            } 
            answer = difnum1 * difnum2;
        } else {
            int min = a;
            if (b < min) {
                min = b;
            }
            if (c < min) {
                min = c;
            }
            if (d < min) {
                min = d;
            }
            answer = min;
        }          
        return answer;
    }
}