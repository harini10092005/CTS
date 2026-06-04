// Using const for fixed values
const eventName = "Music Fest";
const eventDate = "15 June 2026";

// Using let because seat count can change
let availableSeats = 50;

// Display event information using template literals
console.log(`Event Name: ${eventName}`);
console.log(`Event Date: ${eventDate}`);
console.log(`Available Seats: ${availableSeats}`);

// User registers for the event
availableSeats--;

// Display updated seats
console.log(`Seats Remaining After Registration: ${availableSeats}`);

// One seat cancelled
availableSeats++;

// Display updated seats after cancellation
console.log(`Seats After Cancellation: ${availableSeats}`);