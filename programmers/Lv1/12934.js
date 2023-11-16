// https://school.programmers.co.kr/learn/courses/30/lessons/12934

function solution(n) {
  return Math.sqrt(n) === parseInt(Math.sqrt(n)) ? (Math.sqrt(n) + 1) ** 2 : -1
}
