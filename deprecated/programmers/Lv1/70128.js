// https://school.programmers.co.kr/learn/courses/30/lessons/70128

function solution(a, b) {
  return a.reduce((acc, cur, i) => acc + (cur * b[i]), 0);
}
