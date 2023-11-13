// https://school.programmers.co.kr/learn/courses/30/lessons/12954

function solution(x, n) {
  var answer = [];

  for (let i = 0; i < n; i++) {
    // 반환될 각 원소는 x * y 로 증가하는 숫자
    answer.push(x * (i + 1));
  }

  return answer;
}
