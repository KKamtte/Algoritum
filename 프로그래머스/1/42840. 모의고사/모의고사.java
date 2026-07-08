import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        // 수포자 별 정답 패턴
        int[] mathGiveUpOne = {1,2,3,4,5};
        int[] mathGiveUpTwo = {2,1,2,3,2,4,2,5};
        int[] mathGiveUpThree = {3,3,1,1,2,2,4,4,5,5};

        // 수포자 별 정답 횟수
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 0);
        map.put(2, 0);
        map.put(3, 0);

        // 정답에 따른 수포자 별 정답 체크
        for (int i = 0; i < answers.length; i++) {
            if (answers[i] == mathGiveUpOne[i % mathGiveUpOne.length]) {
                map.put(1, map.get(1) + 1);
            }
            if (answers[i] == mathGiveUpTwo[i % mathGiveUpTwo.length]) {
                map.put(2, map.get(2) + 1);
            }
            if (answers[i] == mathGiveUpThree[i % mathGiveUpThree.length]) {
                map.put(3, map.get(3) + 1);
            }
        }

        // 최다 정답 값 구함
        int maxAnswer = Math.max(map.get(1), map.get(2));
        maxAnswer = Math.max(maxAnswer, map.get(3));

        // 최다 정답자 구함
        List<Integer> answer = new ArrayList<>();
        for (int i = 1; i <= 3; i++) {
            if (map.get(i) == maxAnswer) {
                answer.add(i);
            }
        }

        return answer.stream().mapToInt(i -> i).toArray();
    }
}