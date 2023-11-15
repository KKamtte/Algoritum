// https://school.programmers.co.kr/learn/courses/30/lessons/12916

function solution(s){
  // 문자열 개수 저장할 obj 생성
  const obj = {};

  // 문자열을 순환하며 소문자로 치환한 뒤 개수를 계산
  [...s.toLowerCase()].forEach(v => {
    obj[v] = (obj[v] || 0) + 1;
  });

  // 비교 문자 개수 결과
  return obj['p'] === obj['y'];
}
