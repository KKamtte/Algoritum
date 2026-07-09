import java.util.*;

public class Solution {
    public int[] solution(int []arr) {
        // 결과 배열을 리스트로 만듬
        List<Integer> answer = new ArrayList<>();

        // 배열의 첫번째 원소를 입력하고, 이를 저장함
        answer.add(arr[0]);
        int temp = arr[0];

        for (int i = 1; i < arr.length; i++) {
            // 저장값과 현재 원소가 다르면 값을 추가하고 저장값을 변경함
            if (arr[i] != temp) {
                answer.add(arr[i]);
                temp = arr[i];
            }
        }

        return answer.stream().mapToInt(Integer::intValue).toArray();
    }
}