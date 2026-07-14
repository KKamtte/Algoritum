import java.util.*;

class Solution {
    public int solution(int bridge_length, int weight, int[] truck_weights) {
        Queue<Integer> bridge = new ArrayDeque<>();
        int time = 0;

        // 우선 bridge 를 초기화
        for (int i = 0; i < bridge_length; i++) {
            bridge.offer(0);
        }

        int currentWeight = 0;
        int idx = 0;
        while (truck_weights.length > idx || currentWeight > 0) {
            // 무게만큼 감소
            Integer out = bridge.poll();
            currentWeight -= out;

            // 다리에 트럭이 더 추가될 수 있는지 검사
            if (truck_weights.length > idx) {
                // 다리 무게가 한도에 도달하지 않았다면
                if (currentWeight + truck_weights[idx] <= weight) {
                    bridge.offer(truck_weights[idx]);
                    currentWeight += truck_weights[idx];
                    idx++;
                } else {
                    bridge.offer(0);
                }
            } else {
                bridge.offer(0);
            }

            // 시간 증가
            time++;
        }

        return time;
    }
}