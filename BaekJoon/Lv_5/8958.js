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
  const numberOfCases = +input[0];

  for (let i = 1; i <= numberOfCases; i++) {
    const quizResult = input[i].split('');
    let quizGrade = 0;
    let bonus = 0;
    for (let j = 0; j < quizResult.length; j++) {
      if (quizResult[j] === 'O') {
        bonus++;
      } else {
        bonus = 0;
      }
      quizGrade += bonus;
    }
    console.log(quizGrade);
  }
  process.exit();
});
