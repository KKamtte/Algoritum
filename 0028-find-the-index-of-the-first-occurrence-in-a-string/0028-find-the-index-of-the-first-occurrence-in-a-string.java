class Solution {
    public int strStr(String haystack, String needle) {
        return kmp(haystack, needle);
    }

    private int bruteforce(String haystack, String needle) {
        int m = haystack.length();
        int n = needle.length();

        for (int i = 0; i <= m - n; i++) {
            int j;

            for (j = 0; j < n; j++) {
                if (haystack.charAt(i + j) != needle.charAt(j)) {
                    break;
                }
            }

            if (j == n) {
                return i;
            }
        }
        return -1;
    }

    private int kmp(String haystack, String needle) {
        int[] lps = buildLPS(needle);

        int i = 0; // haystack 포인터
        int j = 0; // needle 포인터

        while (i < haystack.length()) {
            if (haystack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;

                // needle 전체를 찾음
                if (j == needle.length()) {
                    return i - j;
                }
            } else {
                if (j > 0) {
                    // 불일치 시 LPS 를 이용해 j 이동
                    j = lps[j - 1];
                } else {
                    i++;
                }
            }

        }

        return -1;
    }

    private int[] buildLPS(String pattern) {
        int[] lps = new int[pattern.length()];
        int len = 0; // 이전 LPS 길이
        int i = 1;

        while (i < pattern.length()) {
            if (pattern.charAt(i) == pattern.charAt(len)) {
                len++;
                lps[i] = len;
                i++;
            } else {
                if (len > 0) {
                    len = lps[len - 1];
                } else {
                    lps[i] = 0;
                    i++;
                }
            }
        }

        return lps;
    }
}