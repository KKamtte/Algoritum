const readline = require('readline');

const rl = readline.createInterface({
    input: process.stdin,
    output: process.stdout
});

rl.on('line', (line) => {
    const input = line.split(' ');
    const A = Number(input[0]);
    const B = Number(input[1]);
    const C = Number(input[2]);

    console.log((A+B)%C);
    console.log(((A%C) + (B%C))%C);
    console.log((A*B)%C);
    console.log(((A%C) * (B%C))%C);

    rl.close();
}).on('close', () => {
    process.exit();
});
