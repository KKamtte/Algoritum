// https://school.programmers.co.kr/learn/courses/30/lessons/12945

function solution(n) {
  // 재귀 방식 접근 => Max call stack 으로 인해 해결 불가능
  // function fib(s, memo = [0, 1]) {
  //   if (memo[s]) return memo[s];
  //   memo[s] = fib(s - 2, memo) + fib(s - 1, memo);
  //   return memo[s];
  // }

  // console.log(fib(n) % 1234567);
  // return fib(n) % 1234567;

  let memo = [0, 1];
  // 재귀 대신 for 이용
  for (let i = 2; i <= n; i++) {
    // 일정 숫자 범위 이상 넘어가면 에러로 인해 매 연산마다 나머지 값으로 저장
    memo[i] = (memo[i - 1] + memo[i - 2]) % 1234567;
  }

  return memo[n];
}
