function minimizeContainer() {
    const container = document.querySelector("#guide-container");
    container.style.display="none";
    const maximizeButton = document.querySelector("#maximize-button");
    maximizeButton.style.display = "block";
    maximizeButton.addEventListener("click", maximizeContainer.bind(container));
}

function maximizeContainer() {
    const container = document.querySelector("#guide-container");
    container.style.display="flex";
    const maximizeButton = document.querySelector("#maximize-button");
    maximizeButton.style.display = "none";
}
function guideNextStep(index) {
    const currDiv = document.querySelector(`#guide-${index}`);
    const nextDiv = document.querySelector(`#guide-${index+1}`);
    currDiv.classList.add("non-display");
    nextDiv.classList.remove("non-display");

}
