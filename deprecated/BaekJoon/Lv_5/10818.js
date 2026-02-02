const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const input = [];

rl.on('line', (line) => {
  input.push(line);
}).on('close', () => {
  const N = +input[0];
  let maxNum = input[1].split(' ')[0];
  let minNum = input[1].split(' ')[0];
  for (let i = 1; i < N; i++) {
    if (maxNum < +input[1].split(' ')[i]) {
      maxNum = +input[1].split(' ')[i];
    }
    if (minNum > input[1].split(' ')[i]) {
      minNum = +input[1].split(' ')[i];
    }
  }
  console.log(minNum, maxNum);
  process.exit();
});
