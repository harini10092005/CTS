console.log("Form submission started");

function submitForm() {

    debugger;

    let payload = {

        name: "Sam",
        email: "sam@gmail.com"
    };

    console.log(payload);

    fetch("https://jsonplaceholder.typicode.com/posts", {

        method: "POST",

        body: JSON.stringify(payload)
    });

    console.log("Request Sent");
}