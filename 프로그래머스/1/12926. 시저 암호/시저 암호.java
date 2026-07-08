class Solution {
    public String solution(String s, int n) {
        // 결과 문자열은 StringBuilder에서 정해진 메모리 크기를 할당
        StringBuilder sb = new StringBuilder(s.length());

        // 문자열을 순회
        for (int i = 0; i < s.length(); i++) {
            // 해당 문자가 대문자인지 소문자인지 공백인지 판별
            char c = s.charAt(i);

            if (Character.isWhitespace(c)) {
                // 공백은 그냥넘김
                sb.append(c);
            } else {
                // 할당된 n 만큼의 결과 문자를 구함
                // base + (문자 - base + n) % 26
                int base = Character.isUpperCase(c) ? 65 : 97;
                int code = c;
                int resultCode = base + (code - base + n) % 26;
                sb.append((char) resultCode);
            }
        }

        return sb.toString();
    }
}