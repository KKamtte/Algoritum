function solution (n, first, mid, last) {
  const res = [];

  (function hanoi(n, first, mid, last) {
    if (n === 1) {
      res.push([first, last]);
      return;
    }
    hanoi(n - 1, first, last, mid);
    res.push([first, last]);
    hanoi(n - 1, mid, first, last);
  })(n, first, mid, last);
  
  console.log(res);
  return res;
}

