class Solution {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        // set 을 만들어줌
        Set<Integer> set = new HashSet<>();

        // 루프를 돌며 원소 검사
        for (int i = 0; i < nums.length; i++) {
            // 만약 윈도우의 위치가 k 보다 크면 하나씩 제거
            if (i > k) {
                set.remove(nums[i - k - 1]);
            }

            // 현재 원소를 추가하는데 있으면 true 반환
            if (!set.add(nums[i])) {
                return true;
            }
        }

        return false;
    }
}