window.onload = function () {
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
    })
}