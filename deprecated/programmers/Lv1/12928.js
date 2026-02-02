// https://school.programmers.co.kr/learn/courses/30/lessons/12928

function solution(n) {
  var answer = 0;

  for (let i = 0; i <= n; i++) {
    // 나머지가 0이 되면 약수이므로 값을 더함
    if (n % i === 0) {
      answer += i;
    }
  }

  return answer;
}
