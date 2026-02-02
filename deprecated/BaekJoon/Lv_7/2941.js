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
  let wordCount = 0;

  const croatiaAlphabet = ['c=', 'c-', 'dz=', 'd-', 'lj', 'nj', 's=', 'z='];
  for (i = 0; i < croatiaAlphabet.length; i++) {
    while (word.indexOf(croatiaAlphabet[i]) >= 0) {
      word = word.replace(croatiaAlphabet[i], 'X');
      wordCount++;
    }
  }

  word = word.replace(/X/g, '');
  console.log(`${word.length + wordCount}`);
  process.exit();
});
