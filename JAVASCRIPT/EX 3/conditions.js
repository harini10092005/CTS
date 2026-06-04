const events = [
    { name: "Dance Show", seats: 10, valid: true },
    { name: "Old Event", seats: 0, valid: false }
];

events.forEach(event => {

    if (event.valid && event.seats > 0) {
        console.log(event.name + " Available");
    } else {
        console.log(event.name + " Hidden");
    }

});

try {

    let seats = 0;

    if (seats <= 0) {
        throw "No seats available";
    }

} catch (error) {
    console.log(error);
}