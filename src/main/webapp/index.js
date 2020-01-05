window.onload = function () {
    doTransition();
    const colorPicker = document.querySelector("#colorPicker");
    const confirmColorButton = document.querySelector("#confirmColor");
    const welcomeBox = document.querySelector("#welcome-box");
    const pickColorDiv  = document.querySelector("#pick-theme-color");
    const aboutYouDiv = document.querySelector("#about-you");
    colorPicker.addEventListener("input", function(event) {
        const themeColor = event.target.value;
        doCustomizedColor(themeColor);
    });
    confirmColorButton.addEventListener("click", function (event) {
        pickColorDiv.classList.add("non-display");
        aboutYouDiv.classList.remove("non-display");

    });

};
