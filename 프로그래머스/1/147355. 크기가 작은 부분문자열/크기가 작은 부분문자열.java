class Solution {
    public int solution(String t, String p) {
        int result = 0;
        long compare = Long.parseLong(p);

        for (int i = 0; i < t.length() - p.length() + 1; i++) {
            long data = Long.valueOf(t.substring(i, i + p.length()));
            if (compare >= data) {
                result++;
            }
        }

        return result;
    }
}