import java.util.*;

class Solution {
    public int[] solution(int[] array, int[][] commands) {
        List<Integer> answer = new ArrayList<>();
        // command 를 순회하며 array 배열을 추출
        for (int i = 0; i < commands.length; i++) {
            int[] sub = Arrays.copyOfRange(array, commands[i][0] - 1, commands[i][1]);
            // 추출된 배열을 오름차순으로 정렬함
            int[] sorted = Arrays.stream(sub).sorted().toArray();

            // 오름차순으로 정렬된 값에서 k 위치에 값을 찾아냄
            int result = sorted[commands[i][2] - 1];

            answer.add(result);
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}