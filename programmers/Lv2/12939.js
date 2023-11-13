// https://school.programmers.co.kr/learn/courses/30/lessons/12939

function solution(s) {
  // 문자열 s를 공백 단위로 분리
  const arr = s.split(' ');
  // arr 를 오름차순으로 정렬
  arr.sort((a, b) => +a - +b);
  // arr의 첫 원소 = 최소값 / arr의 마지막 원소 = 최대값
  return arr[0] + ' ' + arr[arr.length - 1];
}

// 다른 사람 풀이
function otherSolution(s) {
  const arr = s.split(' ');

  // 문자열에도 Min / Max 를 사용할 수 있음
  return Math.min(...arr) + ' ' + Math.max(...arr);
}
