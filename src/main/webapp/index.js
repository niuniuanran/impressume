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
    });

    const colorPicker = document.querySelector("#colorPicker");
    colorPicker.addEventListener("input", function(event) {
        const themeColor = event.target.value;
        document.documentElement.style
            .setProperty('--customized-theme-color', themeColor);
        document.documentElement.style
            .setProperty('--customized-light-color', themeColor);
        document.documentElement.style
            .setProperty('--customized-heavy-color', themeColor);
    });
    };



/**
 * @return {string}
 */
function ColorLuminance(hex, lum) {

    // validate hex string
    hex = String(hex).replace(/[^0-9a-f]/gi, '');
    if (hex.length < 6) {
        hex = hex[0]+hex[0]+hex[1]+hex[1]+hex[2]+hex[2];
    }
    lum = lum || 0;
    // convert to decimal and change luminosity
    let rgb = "#", c, i;
    for (i = 0; i < 3; i++) {
        c = parseInt(hex.substr(i*2,2), 16);
        c = Math.round(Math.min(Math.max(0, c + (c * lum)), 255)).toString(16);
        rgb += ("00"+c).substr(c.length);
    }

    return rgb;
}