sum=0;
const number = parseInt(prompt('Enter a positive integer: '));
for (let i = 1; i <= number; i++) {
    sum += i;
}

console.log('The sum of natural numbers:', sum);
document.write(sum);