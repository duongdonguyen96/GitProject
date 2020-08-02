function convertCaptcha() {
    let a = Math.floor(Math.random() * 5);

    switch (a) {
        case 0:
            document.getElementById("img1").src =
                "/forgot_form/image_captcha/captcha1.png";
            break;
        case 1:
            document.getElementById("img1").src =
                "/forgot_form/image_captcha/captcha2.png";
            break;
        case 2:
            document.getElementById("img1").src =
                "/forgot_form/image_captcha/captcha3.png";
            break;
        case 3:
            document.getElementById("img1").src =
                "/forgot_form/image_captcha/captcha4.png";
            break;
        case 4:
            document.getElementById("img1").src =
                "/forgot_form/image_captcha/captcha5.png";
            break;
        case 5:
            document.getElementById("img1").src =
                "/forgot_form/image_captcha/captcha3.png";
            break;
    }
}

function exitPage() {
    window.location = "../../../login_form.html";
    alert("Chuyển về trang đăng nhập");
}
// number = Math.floor(Math.random() * (3 - 1 + 1));
// switch (number) {
//   case 1:
//     document.getElementById("tren").src = "./css1.png";
//     break;