// https://school.programmers.co.kr/learn/courses/30/lessons/12947

function solution(x) {
  // 자리수 합 구함
  let k = [...x.toString()].reduce((acc, cur) => acc + +cur, 0);
  // 나누어 떨어지는지 반환
  return x % k === 0; 
}
