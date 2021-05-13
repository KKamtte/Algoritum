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
  let N = +input[0];
  if (N < 10) {
    N *= 10;
  }
  let x = N;
  let count = 1;
  while (true) {
    const y = Math.floor(x / 10);
    const z = x % 10;
    x = ((y + z) % 10) + z * 10;

    if (N === x) {
      break;
    }
    count++;
  }
  console.log(count);
  process.exit();
});
