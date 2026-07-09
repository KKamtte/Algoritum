class Solution {
    public int solution(int n) {
        boolean[] isNotPrime = new boolean[n + 1];

        for (int i = 2; i <= n; i++) {
            if (!isNotPrime[i]) {
                for (int j = i + i; j <= n; j += i) {
                    isNotPrime[j] = true;
                }
            }
        }

        int result = 0;

        for (int i = 2; i < isNotPrime.length; i++) {
            if (!isNotPrime[i]) {
                result++;
            }
        }

        return result;
    }
}