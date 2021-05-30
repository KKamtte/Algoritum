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
  let word = input[0];
  const regex = new RegExp('c=|c-|dz=|d-|lj|nj|s=|z=', 'g');

  console.log(word.replace(regex, 'X').length);

  process.exit();
});
