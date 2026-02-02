const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

let firstParam = '';
let secondParam = '';

rl.on('line', (line1) => {
  rl.on('line', (line2) => {
    firstParam = line1;
    secondParam = line2;

    console.log((secondParam % 10) * firstParam); // 두번째 인자 첫째자리 * 첫번째 인자
    console.log(Math.floor((secondParam % 100) / 10) * firstParam); // 두번째 인자 두번쨰 자리 * 첫번째 인자
    console.log(Math.floor(secondParam / 100) * firstParam); // 두번째 인자 세번째 자리 * 첫번째 인자
    console.log(firstParam * secondParam); // 두 인자의 곱 결과

    rl.close();
  });
}).on('close', () => {
  process.exit();
});
