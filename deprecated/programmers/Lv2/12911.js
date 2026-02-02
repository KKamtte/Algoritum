// https://school.programmers.co.kr/learn/courses/30/lessons/12911

function solution(n) {
  function match(n, m) {
    // 이진수로 변환하여 두 수의 1 개수가 일치하는지 확인
    return n.toString(2).match(/1/g).length === m.toString(2).match(/1/g).length 
    ? m // 찾으면 반환
    : match(n, m + 1); // 찾지 못하면 1을 더해서 헬퍼함수 호출
  }
  
  return match(n, n + 1);
}

function otherSolution(n) {
  var i, j;
  for (i = 0; !(n & 1); i++) n = n >> 1; // 1을 찾을때까지 우로 쉬프트, 쉬프트 횟수 = i
  for (j = 0; n & 1; i++, j++) n = n >> 1; // 0을 찾을때까지 우로 쉬프트, 1의 갯수 = j
  for (j--, n++; i != j; i--) n = n << 1; // 0자리에 1대입, 1의 갯수 -1, i === j 가 될때까지 죄로 쉬프트하면서 쉬프트 횟수 -1
  for (i; i; i--, n++) n = n << 1; // i === 0 될때까지 좌로 쉬프트 하면서 쉬프트 횟수 -1, 0자리에 1대입

  return n;
}
