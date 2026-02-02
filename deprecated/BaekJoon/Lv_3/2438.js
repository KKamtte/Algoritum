const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let result = '';

rl.on('line', (line) => {
  const input = +line;

  for (let i = 1; i <= input; i++) {
    for (let j = 0; j < i; j++) {
      result += '*';
    }
    result += '\n';
  }

  console.log(result);

  rl.close();
}).on('close', () => {
  process.exit();
});
