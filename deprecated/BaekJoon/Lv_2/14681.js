const readline = require('readline');

const rl = readline.createInterface({
  input: process.stdin,
  output: process.stdout,
});

rl.on('line', (line1) => {
  rl.on('line', (line2) => {
    const x = line1;
    const y = line2;

    if (x > 0 && y > 0) {
      console.log(1);
    }
    if (x < 0 && y > 0) {
      console.log(2);
    }
    if (x < 0 && y < 0) {
      console.log(3);
    }
    if (x > 0 && y < 0) {
      console.log(4);
    }

    rl.close();
  });
}).on('close', () => {
  process.exit();
});
