class Solution {
    public String smallestSubsequence(String s) {
        // 각 문자의 마지막 등장 위치 기록
        int[] lastIndex = new int[26];
        for (int i = 0; i < s.length(); i++) {
            lastIndex[s.charAt(i) - 'a'] = i;
        }

        // stack 결과 구성
        Deque<Character> stack = new ArrayDeque<>();
        boolean[] inStack = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);

            // 이미 결과가 있으면 스킵
            if (inStack[c - 'a']) {
                continue;
            }

            // stack 상단이 현재 문자보다 크고 뒤에 또 나온다면 제거
            while (!stack.isEmpty() && stack.peek() > c && lastIndex[stack.peek() - 'a'] > i) {
                inStack[stack.pop() - 'a'] = false;
            }

            stack.push(c);
            inStack[c - 'a'] = true;
        }

        // stack 을 string 변환
        StringBuilder sb = new StringBuilder();
        for (char c : stack) {
            sb.append(c);
        }
        
        return sb.reverse().toString();
    }
}