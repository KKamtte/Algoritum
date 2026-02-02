const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on('line', (line) => {
  const input = +line;

  for (let i = 1; i <= input; i++) {
    console.log(i);
  }

  rl.close();
}).on('close', () => {
  process.exit();
});
