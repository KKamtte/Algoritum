class Solution {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            int subtract = target - nums[i];

            if (map.containsKey(subtract)) {
                return new int[]{map.get(subtract), i};
            }

            map.put(nums[i], i);
        }

        return new int[]{};
    }
}