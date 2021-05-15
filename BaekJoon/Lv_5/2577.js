const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const input = [];

rl.on('line', (line) => {
  input.push(line);
}).on('close', () => {
  let A = +input[0];
  let B = +input[1];
  let C = +input[2];
  const multiple = A * B * C;
  const array = multiple.toString().split('');
  const result = [0, 0, 0, 0, 0, 0, 0, 0, 0, 0];
  for (let i = 0; i < array.length; i++) {
    result[array[i]]++;
  }
  for (let i = 0; i < result.length; i++) {
    console.log(result[i]);
  }
  process.exit();
});
