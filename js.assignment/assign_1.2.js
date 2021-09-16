sum=0,i;
const number = parseInt(prompt('Enter a positive integer: '));
for (let i = 1; i <= number; i++)
if(i%3 === 0||i%5 === 0) {
    sum += i;
}

console.log('The multiply of three number:', number);
document.write(sum);
