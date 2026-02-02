// https://school.programmers.co.kr/learn/courses/30/lessons/12951

function solution(s) {
  // 공백 단위로 문자열 분리
  const arr = s.split(' ');
  // 문자열 전부 소문자로 변경
  const arr2 = arr.map((v) => v.toLowerCase());
  // 공백을 제외하고 첫 문자를 대문자로 변경
  const arr3 = arr2.map((v) => v !== '' ? v.replace(v[0], v[0].toUpperCase()) : '');
  // 공백을 추가하여 문자열 반환
  return arr3.join(' ');
}

function otherSolution(s) {
  // 문자열 분리
  return s.split(" ")
    // charAt 을 통해 0번 인덱스 접근 + substring을 통해 1번 인덱스 부터 소문자로 변경
    .map(v => v.charAt(0).toUpperCase() + v.substring(1).toLowerCase())
    // 공백 추가하여 문자열 반환
    .join(" ");
}
