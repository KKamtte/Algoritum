// https://school.programmers.co.kr/learn/courses/30/lessons/70129

function solution(s) {
  let count = 0;
  let zeroCount = 0;

  while (s !== '1') {
    // 0 이 아닌 개수만 골라서 길이를 구함
    let temp = [...s].filter((v) => v !== '0').length;
    // 현재 s 길이 - 0 이 아닌 개수 길이 = 0의 개수
    zeroCount += (s.length - temp);
    // s 를 이진수로 변환
    s = temp.toString(2);
    count++;
  }

  return [count, zeroCount];
}

function otherSolution(s) {
  var ans = [0,0];
  while (s !== "1"){
      const oldLen = s.length;
      // filter 대신 정규식을 통해 처리 (시간복잡도 감소)
      s = s.replace(/0/g, "");
      const newLen = s.length;
      s = newLen.toString('2');

      ans[1] += oldLen - newLen;
      ans[0]++;
  }

  return ans;
}

