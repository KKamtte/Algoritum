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
  const number1 = +reverse(input[0].split(' ')[0]);
  const number2 = +reverse(input[0].split(' ')[1]);

  if (number1 > number2) {
    console.log(number1);
  } else {
    console.log(number2);
  }
});

const reverse = (str) => {
  const array = str.split('');
  const reverse = array.reverse();
  return reverse.join('');
};
