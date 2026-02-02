// https://school.programmers.co.kr/learn/courses/30/lessons/12933

function solution(n) {
  // number 타입 string 으로 변환 후 처리
  let arr = [...n.toString()];
  // 오름차순 정렬
  arr.sort((a, b) => b - a);
  // 정렬된 값 합치고 number 타입으로 반환
  return +a.join('')
}
