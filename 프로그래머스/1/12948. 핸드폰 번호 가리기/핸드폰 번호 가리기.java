class Solution {
    public String solution(String phone_number) {
        int idx = phone_number.length() - 4;
        return "*".repeat(idx) + phone_number.substring(idx);
    }
}