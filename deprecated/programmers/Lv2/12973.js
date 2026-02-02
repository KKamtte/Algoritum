// https://school.programmers.co.kr/learn/courses/30/lessons/12973

function solution(s) {
  let stack = [];
  let i = 0;

  while (i < s.length) {
    if (s[i] === stack[stack.length - 1]) {
      stack.pop();
    } else {
      stack.push(s[i]);
    }
    i++;
  }

  return stack.length ? 0 : 1;
}

solution('baabaa');
solution('cdcd');
