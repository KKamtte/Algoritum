// https://school.programmers.co.kr/learn/courses/30/lessons/12909

function solution(s){
  var answer = 0;

  for (let i = 0; i < s.length; i++) {
    if (s[i] === '(') {
      answer++;
    } else {
      if (--answer < 0) return false
    }
  }

  return !answer;
}
