import java.util.*;

class Solution {
    public boolean solution(String[] phone_book) {
        // phone_book 을 정렬
        String[] sortedPhoneBook = Arrays.stream(phone_book).sorted().toArray(String[]::new);

        // phone_book 을 n-1 까지 순회하며 n과 n+1을 비교
        for (int i = 0; i < sortedPhoneBook.length - 1; i++) {
            // 만약 접두사가 일치하면 에러 반환
            if (sortedPhoneBook[i + 1].startsWith(sortedPhoneBook[i])) {
                return false;
            }
        }

        return true;
    }
}