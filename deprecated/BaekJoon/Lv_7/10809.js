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
  const word = input[0];
  let result = '';

  for (let i = 97; i < 123; i++) {
    result += word.indexOf(String.fromCharCode(i)) + ' ';
  }
  console.log(result);

  process.exit();
});
