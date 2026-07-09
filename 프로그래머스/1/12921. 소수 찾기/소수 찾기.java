class Solution {
    public int solution(int n) {
        // 인덱스가 숫자 자체를 의미하도록 크기를 n+1로 설정
        // isComposite[i] == true  →  i는 소수가 아님 (지워짐)
        // isComposite[i] == false →  i는 아직 소수 후보 (지워지지 않음)
        boolean[] isComposite = new boolean[n + 1];

        // 2부터 n까지 순회
        for (int i = 2; i <= n; i++) {
            // 아직 지워지지 않았다면 i는 소수 → i의 배수들을 전부 지운다
            if (!isComposite[i]) {
                // i 자신은 지우지 않고, i*2부터 시작해 i씩 더해가며 배수를 지움
                // 나눗셈(%) 없이 덧셈만으로 배수를 찾는 것이 이 알고리즘의 핵심
                for (int multiple = i + i; multiple <= n; multiple += i) {
                    isComposite[multiple] = true;
                }
            }
        }

        // 2부터 n까지 지워지지 않은(=소수인) 개수를 센다
        // 0, 1은 소수가 아니므로 애초에 2부터 시작해서 제외
        int primeCount = 0;
        for (int i = 2; i <= n; i++) {
            if (!isComposite[i]) {
                primeCount++;
            }
        }

        return primeCount;
    }
}