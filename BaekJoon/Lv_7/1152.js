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
  const word = input[0].trim();
  let flag = false;
  let count = 0;

  for (let i = 0; i < word.length; i++) {
    const letter = word.charCodeAt(i);
    if ((letter >= 65 && letter < 91) || (letter >= 97 && letter < 123)) {
      flag = true;
    } else {
      flag = false;
    }
    if (flag === false || i + 1 === word.length) {
      count++;
    }
  }
  console.log(count);
  process.exit();
});
