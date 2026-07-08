import java.util.*;

class Solution {
    public int solution(int[] nums) {
        // 먼저 최대로 선택할 수 있는 크기를 구함
        int select = nums.length / 2;

        // 다음으로 Set 을 활용하여 배열의 중복을 제거함
        Set<Integer> duplicate = new HashSet<>();
        for (int i : nums) {
            duplicate.add(i);
        }

        // 중복을 제거한 크기와 최대 선택 가능한 크기 중 더 작은 값을 반환함
        return Math.min(select, duplicate.size());
    }
}