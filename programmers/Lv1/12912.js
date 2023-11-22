// https://school.programmers.co.kr/learn/courses/30/lessons/12912

function solution(a, b) {
  let min = Math.min(a, b);
  let max = Math.max(a, b);

  // 공차가 1인 등차수열의 합 적용
  return (max - min + 1)(min + max) / 2;
}
