const eventsList = [];

function addEvent(name, category) {
    eventsList.push({ name, category });
}

function registerUser(user, eventName) {
    console.log(user + " registered for " + eventName);
}

function filterEventsByCategory(category) {
    return eventsList.filter(event => event.category === category);
}

function registrationTracker() {

    let count = 0;

    return function () {
        count++;
        return count;
    };
}

const track = registrationTracker();

console.log(track());
console.log(track());

addEvent("Music Fest", "Music");

console.log(filterEventsByCategory("Music"));