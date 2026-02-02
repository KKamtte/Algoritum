// https://school.programmers.co.kr/learn/courses/30/lessons/12910

function solution(arr, divisor) {
  var answer = arr.filter((v) => v % divisor === 0);
  return answer.length ? answer.sort((a, b) => a - b) : [-1];
}
