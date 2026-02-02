const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const input = [];
let X,
  result = '';

rl.on('line', (line) => {
  input.push(line);
  X = +input[0];
}).on('close', () => {
  for (let i = 1; i <= X; i++) {
    const x = +input[i].split(' ')[0];
    const y = +input[i].split(' ')[1];
    result += x + y + '\n';
  }
  console.log(result);
  process.exit();
});
