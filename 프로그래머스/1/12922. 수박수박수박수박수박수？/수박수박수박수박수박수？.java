class Solution {
    public String solution(int n) {
        // 목을 먼저 구함
        int quot = n / 2;

        // 목 만큼 '수박'을 추가 (repeat)
        String answer = "수박".repeat(quot);

        // return 시 n이 홀수면 '수' 를 더해서 리턴 아니면 바로 리턴
        return n % 2 == 0 ? answer : answer + "수";
    }
}