const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const input = [];
let X,
  N,
  result = '';

rl.on('line', (line) => {
  input.push(line);
  X = input[0].split(' ')[0];
  N = input[0].split(' ')[1];
}).on('close', () => {
  for (let i = 0; i < X; i++) {
    if (+input[1].split(' ')[i] < +N) {
      result += input[1].split(' ')[i] + ' ';
    }
  }
  console.log(result);
  process.exit();
});
