// https://school.programmers.co.kr/learn/courses/30/lessons/12943

function solution(num) {
  var answer = 0;

  // num 이 1이 아니고 answer 이 500이 아니면 반복
  while (num !== 1 && answer !== 500) {
    if (num % 2 === 0) {
      // 짝수인 경우 2로 나눔
      num /= 2;
    } else {
      // 홀수인 경우 3곱하고 1을 더함
      num = num * 3 + 1;
    }

    answer++;
  }

  return num === 1 ? answer : -1;
}

// 재귀 호출을 활용한 다른 풀이
function otherSolution(num) {
  function collatzGuessCount(num, acc) {
    return num === 1 ? (acc > 500 ? -1 : acc) : collatzGuessCount(processCollatz(num), acc + 1)
  }

  function processCollatz(num) {
    return num % 2 ? num * 3 + 1 : num / 2;
  }

  return collatzGuessCount(num, 0);
}
