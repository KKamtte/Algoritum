// https://school.programmers.co.kr/learn/courses/30/lessons/12944

function solution(arr) {
  // reduce 를 이용해 배열 전체 합 구함
  const sum = arr.reduce((acc, cur) => acc + cur, 0);
  // 전체 합에서 배열의 길이만큼 나눠 평균 반환
  return sum / arr.length;
}
