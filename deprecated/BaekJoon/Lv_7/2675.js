const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

const input = [];

rl.on('line', (line) => {
  input.push(line);
  if (input.length > +input[0]) {
    rl.close();
  }
}).on('close', () => {
  const testCase = +input[0];

  for (let i = 1; i <= testCase; i++) {
    const repeat = +input[i].split(' ')[0];
    const word = input[i].split(' ')[1];
    let newWord = '';
    for (let j = 0; j < word.length; j++) {
      newWord += word[j].repeat(repeat);
    }
    console.log(newWord);
  }

  process.exit();
});
