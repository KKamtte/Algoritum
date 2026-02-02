// https://school.programmers.co.kr/learn/courses/30/lessons/86051

function solution(numbers) {
  var answer = numbers.reduce((acc, cur) => acc - cur, 45);
  return answer;
}
