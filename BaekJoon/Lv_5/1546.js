const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const input = [];

rl.on('line', (line) => {
  input.push(line);
}).on('close', () => {
  const subjectCount = +input[0];
  let readGrade = input[1].split(' ');
  let M = +readGrade[0];
  let average = 0;

  // step1 최댓값 M 고르기
  for (let i = 0; i < subjectCount; i++) {
    if (M < +readGrade[i]) {
      M = +readGrade[i];
    }
  }

  // step2 점수/최대값 * 100 으로 변경
  for (let i = 0; i < subjectCount; i++) {
    readGrade[i] = (readGrade[i] / M) * 100;
  }

  // step3 새로운 평균 계산
  for (let i = 0; i < subjectCount; i++) {
    average += readGrade[i];
  }
  console.log(average / subjectCount);

  process.exit();
});
