const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const input = [];
const array = [];

rl.on('line', (line) => {
  input.push(line);
}).on('close', () => {
  let result = 0;
  for (let i = 0; i < 10; i++) {
    array[input[i] % 42] = true;
  }
  for (let i = 0; i < array.length; i++) {
    if (array[i] === true) result++;
  }
  console.log(result);
});
