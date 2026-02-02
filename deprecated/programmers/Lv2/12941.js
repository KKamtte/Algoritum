// https://school.programmers.co.kr/learn/courses/30/lessons/12941

function solution(A,B){
  var answer = 0;

  // 각각 오름차순 및 내림차순으로 정렬
  A.sort((a, b) => a - b);
  B.sort((a, b) => b - a);

  // 각 배열의 작은값 X 큰값 순서로 결과를 더해감
  return A.reduce((acc, cur, i) => acc + cur * B[i], 0);
}
