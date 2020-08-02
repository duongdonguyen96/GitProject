function email_Validate(email) {
    return /^[^\s@]+@[^\s@]+\.[^\s@]+$/.test(email);
}

function information_Validate() {
    let username = document.getElementById("user_name").value;
    let password = document.getElementById("pass_word").value;
    let checkpassword = document.getElementById("check_pass_word").value;
    let email = document.getElementById("email").value;
    let check1 = false;
    let check2 = false;
    let check3 = false;
    let check4 = false;
    //username
    if (_.isEmpty(username)) {
        document.getElementById("notify_name").innerHTML =
            "Vui lòng nhập tên truy cập";
    } else if (username.length <= 5 || username.length > 16) {
        document.getElementById("notify_name").innerHTML =
            "Tên truy cập phải có 6-15 ký tự";
    } else {
        document.getElementById("notify_name").innerHTML = "";
        check1 = true;
    }
    //password
    if (_.isEmpty(password)) {
        document.getElementById("notify_password").innerHTML =
            "Vui lòng nhập mật khẩu";
    } else if (password.length <= 5 || password.length > 16) {
        document.getElementById("notify_password").innerHTML =
            "Mật khẩu phải có 6-15 ký tự";
    } else {
        document.getElementById("notify_password").innerHTML = "";
        check2 = true;
    }
    //checkpassword

    if (checkpassword !== password) {
        document.getElementById("notify_checkpassword").innerHTML =
            "Mật khẩu không đúng";
    } else {
        document.getElementById("notify_checkpassword").innerHTML = "";
        check3 = true;
    }
    //email
    if (_.isEmpty(email)) {
        document.getElementById("notify_email").innerHTML = "Vui lòng nhập Email";
    } else if (!email_Validate(email)) {
        document.getElementById("notify_email").innerHTML =
            "Email không đúng định dạng";
    } else {
        document.getElementById("notify_email").innerHTML = "";
        check4 = true;
    }
    if (check1 == true && check2 == true && check3 == true && check4 == true) {
        document.getElementById("notify_name").innerHTML = "";
        document.getElementById("notify_password").innerHTML = "";
        document.getElementById("notify_checkpassword").innerHTML = "";
        document.getElementById("notify_email").innerHTML = "";
        let result = confirm(
            "Tạo tài khoản thành công..!" +
            "Bạn có muốn chuyển tới trang đăng nhập không?"
        );
        if (result == true) {
            window.location = "login_form.html";
        } else {
            alert("OK. không muốn đi thì ở lại");
        }
    }
}