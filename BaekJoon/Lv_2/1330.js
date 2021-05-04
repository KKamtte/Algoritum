const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on('line', line => {
  const input = line.split(' ');
  if (+input[0] > +input[1]) {
    console.log('>');
  }
  if (+input[0] < +input[1]) {
    console.log('<');
  }
  if (+input[0] === +input[1]) {
    console.log('==');
  }
  rl.close();
}).on('close', () => {
  process.exit();
});
