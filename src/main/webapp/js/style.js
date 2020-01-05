function doCustomizedColor(themeColor) {
    document.documentElement.style
        .setProperty('--customized-theme-color', themeColor);
    document.documentElement.style
        .setProperty('--customized-light-color', themeColor);
    document.documentElement.style
        .setProperty('--customized-heavy-color', themeColor);

}

function doTransition() {
    document.querySelectorAll(".theme-bg-transition").forEach(function (element) {
        element.classList.remove("light-bg");
        element.classList.add("theme-bg");
    });
    document.querySelectorAll(".white-bg-transition").forEach(function (element) {
        element.classList.remove("light-bg");
        element.classList.add("white-bg");
    });
    document.querySelectorAll(".theme-txt-transition").forEach(function (element) {
        element.classList.add("theme-txt");
    });

}
