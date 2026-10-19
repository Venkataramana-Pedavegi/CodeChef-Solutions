function runCountdown() {
let seconds = 3;
console.log(`${seconds} seconds left`);
if (seconds === 0) {
clearInterval(intervalId);

setTimeout(() => {
console.log("Countdown complete!");
 }, 1000);
}
}, 1000);
}

module.exports = { runCountdown };

if (require.main === module) {
runCountdown();
}
console.log("Countdown is starting...");
 const intervalId = setInterval(() => {
 seconds--;
