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
function guideNextStep(oldIndex, nextIndex) {
    const currDiv = document.querySelector(`#guide-${oldIndex}`);
    const nextDiv = document.querySelector(`#guide-${nextIndex}`);
    currDiv.classList.add("non-display");
    nextDiv.classList.remove("non-display");

}
