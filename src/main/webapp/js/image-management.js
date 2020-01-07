    const uploadPhoto = function (inputElement, url) {
        console.log("url " + url);
        let file = inputElement.files[0];
        if (file.type.match(/image.*/)) {
            console.log('An image has been loaded');
            // Ensure it's an image
        }



    };
