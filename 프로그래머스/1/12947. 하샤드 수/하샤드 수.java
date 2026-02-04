class Solution {
    public boolean solution(int x) {
        return divideAndRemain(x);
    }
    
    private boolean divideAndRemain(int x) {
        int temp = x;
        int sum = 0;

        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }

        return x % sum == 0;
    }

    private boolean useString(int x) {
        String str = String.valueOf(x);
        int sum = 0;

        for (int i = 0; i < str.length(); i++) {
            sum += str.charAt(i) - '0';
        }

        return x % sum == 0;
    }

    private boolean useStream(int x) {
        int sum = String.valueOf(x)
                .chars()
                .map(c -> c - '0')
                .sum();

        return x % sum == 0;
    }
}