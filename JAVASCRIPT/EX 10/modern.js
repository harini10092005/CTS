const event = {

    name: "Art Fest",
    date: "12 June"
};

const { name, date } = event;

console.log(name);
console.log(date);

const events = ["Music", "Dance"];

const clonedEvents = [...events];

console.log(clonedEvents);

function greet(user = "Guest") {

    console.log("Welcome " + user);
}

greet();