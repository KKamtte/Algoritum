class Solution {
    public int solution(int left, int right) {
        int result = 0;

        // left 에서 right 까지 수를 계산
        for (int i = left; i <= right; i++) {
            // 약수의 개수를 구함
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            // 짝수면 더하고 홀수면 빼줌
            if (count % 2 == 0) {
                result += i;
            } else  {
                result -= i;
            }
        }

        return result;
    }
}