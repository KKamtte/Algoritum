import java.util.*;

class Solution {
    public String solution(String[] participant, String[] completion) {
        // Map 으로 변환
        Map<String, Integer> map = new HashMap<>();

        // 완주자를 map 에 추가
        for (String s : completion) {
            map.put(s, map.getOrDefault(s, 0) + 1);
        }

        // 참석자 루프를 돌며 값을 구하며 존재하면 1 감소 0이면 반환
        for (String s : participant) {
            int i = map.getOrDefault(s, 0 );
            if (i == 0) {
                return s;
            } else {
                map.put(s, map.get(s) - 1);
            }
        }
        
        throw new IllegalStateException("미완주자가 존재하지 않음");
    }
}