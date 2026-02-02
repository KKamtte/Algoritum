// https://school.programmers.co.kr/learn/courses/30/lessons/76501

function solution(absolutes, signs) {
  var answer = absolutes.reduce((acc, cur, i) => signs[i] ? acc + cur : acc - cur, 0);
  return answer;
}
