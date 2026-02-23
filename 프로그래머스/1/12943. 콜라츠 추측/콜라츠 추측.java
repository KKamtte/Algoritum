class Solution {
    public int solution(int num) {
        int answer = 0; 
        long temp = num;
        while (answer < 500) {
            if (temp == 1) {
                return answer;
            }
            if (temp % 2 == 0) {
                temp /= 2;
            } else {
                temp = temp * 3 + 1;
            }
            answer++;
        }

        return -1;
    }
}