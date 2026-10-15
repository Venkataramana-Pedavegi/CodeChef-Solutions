const options = { timeZone: 'Asia/Kolkata', hour: 'numeric', hour12: false };
const currentHour = parseInt(new Intl.DateTimeFormat('en-US', options).format(new Date()), 10);

let greeting;

if (currentHour < 12) {
    greeting = "Good Morning!";
    } else if (currentHour < 17) {
        greeting = "Good Afternoon!";
        } else {
            greeting = "Good Evening!";
            }

            console.log(currentHour);
            console.log(greeting);