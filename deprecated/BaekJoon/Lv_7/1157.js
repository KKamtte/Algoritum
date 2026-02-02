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
  const word = input[0].toUpperCase();
  const data = { key: '?', count: 0 };

  for (let i = 65; i < 91; i++) {
    const array = [...word.matchAll(String.fromCharCode(i))];
    if (array.length > data.count) {
      data.key = String.fromCharCode(i);
      data.count = array.length;
    } else if (array.length === data.count) {
      data.key = '?';
    }
  }
  console.log(data.key);
  process.exit();
});
