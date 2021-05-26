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
  const word = input[0].split('');

  let time = 0;
  for (let i = 0; i < word.length; i++) {
    if (['A', 'B', 'C'].includes(word[i])) {
      time += 3;
    } else if (['D', 'E', 'F'].includes(word[i])) {
      time += 4;
    } else if (['G', 'H', 'I'].includes(word[i])) {
      time += 5;
    } else if (['J', 'K', 'L'].includes(word[i])) {
      time += 6;
    } else if (['M', 'N', 'O'].includes(word[i])) {
      time += 7;
    } else if (['P', 'Q', 'R', 'S'].includes(word[i])) {
      time += 8;
    } else if (['T', 'U', 'V'].includes(word[i])) {
      time += 9;
    } else if (['W', 'X', 'Y', 'Z'].includes(word[i])) {
      time += 10;
    }
  }
  console.log(time);
});
