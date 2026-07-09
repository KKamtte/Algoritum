class Solution {
    public int solution(int n) {
        if (n == 0) {
            return 0;
        }

        int result = 0;

        for (int i = n; i > 0; i--) {
            if (n % i == 0) {
                result += i;
            }
        }

        return result;
    }
}