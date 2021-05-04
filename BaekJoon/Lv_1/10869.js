const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on('line', line => {
  const input = line.split(' ');

  console.log(Number(input[0]) + Number(input[1]));
  console.log(Number(input[0]) - Number(input[1]));
  console.log(Number(input[0]) * Number(input[1]));
  console.log(Math.floor(Number(input[0]) / Number(input[1])));
  console.log(Number(input[0]) % Number(input[1]));

  rl.close();
}).on('close', () => {
  process.exit();
});
