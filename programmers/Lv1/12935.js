// https://school.programmers.co.kr/learn/courses/30/lessons/12935

function solution(arr) {
  let min = Math.min.apply(null, arr);
  let answer = arr.filter((v) => v > min);
  return answer.length ? answer : [-1];
}
