const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const input = [];

rl.on('line', (line) => {
  input.push(line);
}).on('close', () => {
  let maxNum = +input[0];
  let maxIndex = 1;
  for (let i = 1; i < 9; i++) {
    if (maxNum < +input[i]) {
      maxNum = +input[i];
      maxIndex = i + 1;
    }
  }
  console.log(maxNum);
  console.log(maxIndex);
  process.exit();
});
