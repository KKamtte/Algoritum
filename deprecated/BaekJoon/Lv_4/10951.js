const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const input = [];

rl.on('line', (line) => {
  input.push(line);
}).on('close', () => {
  let i = 0;
  while (i < input.length) {
    const x = +input[i].split(' ')[0];
    const y = +input[i].split(' ')[1];
    console.log(x + y);
    i++;
  }
  process.exit();
});
