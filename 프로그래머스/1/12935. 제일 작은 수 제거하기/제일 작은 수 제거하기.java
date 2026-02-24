import java.util.*;

class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1) {
            return new int[]{-1};
        }
        int min = Arrays.stream(arr).min().getAsInt();

        List<Integer> list = new ArrayList<>();
        for (int i : arr) {
            if (i != min) {
                list.add(i);
            }
        }

        return list.stream().mapToInt(Integer::intValue).toArray();
    }
}