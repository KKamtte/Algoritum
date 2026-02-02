// https://school.programmers.co.kr/learn/courses/30/lessons/12948

function solution(phone_number) {
  phone_number.replace(/\d(?=\d{4})/g, "*"); // 정규식으로 표현
  return '*'.repeat(phone_number.length - 4) + phone_number.slice(-4);
}
