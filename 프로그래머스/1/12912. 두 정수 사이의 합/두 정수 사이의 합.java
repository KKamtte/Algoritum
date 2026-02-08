class Solution {
    public long solution(int a, int b) {
        int min = (a >= b) ? b : a;
        int max = (a >= b) ? a : b;

        long count = max - min + 1;
        return (long)(min + max) * count / 2;
    }
}