const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on('line', (line) => {
  const input = line.split(' ');

  if (+input[1] - 45 < 0) {
    if (+input[0] - 1 < 0) {
      console.log(23, +input[1] + 15);
    } else {
      console.log(+input[0] - 1, +input[1] + 15);
    }
  } else {
    console.log(+input[0], +input[1] - 45);
  }

  rl.close();
}).on('close', () => {
  process.exit();
});
