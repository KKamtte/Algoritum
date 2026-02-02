const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const input = [];

rl.on('line', (line) => {
  input.push(line);
  rl.close();
}).on('close', () => {
  let num = +input[0];
  let sum = 0;
  let count = 0;
  while (true) {
    count++;
    sum = Math.floor(num / 10) + (num % 10);
    num = (num % 10) * 10 + (sum % 10);
    if (num === +input[0]) break;
  }
  console.log(count);
  process.exit();
});
