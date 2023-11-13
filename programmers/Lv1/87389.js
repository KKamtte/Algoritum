// https://school.programmers.co.kr/learn/courses/30/lessons/87389

function solution(n) {
  for (let i = 1; i < n; i++) {
    // 1 부터 시작하여 나머지가 1이 되면 반환
    if (n % i === 1) {
        return i;
    }
  }
}
