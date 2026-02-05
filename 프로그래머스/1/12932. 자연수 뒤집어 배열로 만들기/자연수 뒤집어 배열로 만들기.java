class Solution {
    public int[] solution(long n) {
        int digit = 0;
        long temp = n;
        while (temp > 0) {
            digit++;
            temp /= 10;
        }

        int[] result = new int[digit];
        temp = n;

        for (int i = 0; i < digit; i++) {
            result[i] = (int)(temp % 10);
            temp /= 10;
        }

        return result;

    }
    
    private int[] steamResult(long n) {
        return new StringBuffer()
                .append(n)
                .reverse()
                .chars()
                .map(c -> c - '0')
                .toArray();
    }
}