const container = document.querySelector("#eventContainer");

const card = document.createElement("div");

card.textContent = "Music Event";

container.appendChild(card);

function updateUI() {

    card.textContent = "Registered Successfully";
}

updateUI();