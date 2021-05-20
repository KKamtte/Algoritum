const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const input = [];

rl.on('line', (line) => {
  input.push(line);
  if (input.length > 1) {
    rl.close();
  }
}).on('close', () => {
  const count = +input[0];
  const number = input[1];
  let result = 0;

  for (let i = 0; i < count; i++) {
    result += +number[i];
  }

  console.log(result);

  process.exit();
});
