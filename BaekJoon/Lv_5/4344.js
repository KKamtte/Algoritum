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
    const array = input[i].split(' ');

    let sum = 0;
    let averageOver = 0;

    for (let j = 1; j <= array[0]; j++) {
      sum += +array[j];
    }
    for (let k = 1; k <= array[0]; k++) {
      if (sum / array[0] < array[k]) {
        averageOver++;
      }
    }
    const result = ((averageOver / array[0]) * 100).toFixed(3);
    console.log(result + '%');
  }
});
