// Làm mắt đọc
let check = true;

function check_Password() {
    if (check) {
        document.getElementById("pass").type = "text";
        check = false;
    } else {
        document.getElementById("pass").type = "password";
        check = true;
    }
}
// Kiểm tra mật khẩu
document.getElementById("myform").addEventListener("submit", function(event) {
    let a = document.getElementById("id").value;
    let b = document.getElementById("pass").value;
    if (a === "" && b === "") {
        alert("Cần nhập tài khoản và mật khẩu");
    } else if (a === "") {
        alert("Cần nhập tài khoản");
    } else if (b === "") {
        alert("Cần nhập mật khẩu");
    } else if (a === "duongdonguyen96" && b === "duongdonguyen96") {
        alert("Đăng nhập thành công");
        window.location = "index.html";
    } else if (a === "duongdonguyen96" && b !== "duongdonguyen96") {
        alert("Mật khẩu khẩu không đúng");
    } else if (a !== "duongdonguyen96" && b === "duongdonguyen96") {
        alert("Tài khoản không đúng");
    } else if (a !== "duongdonguyen96" && b !== "duongdonguyen96") {
        alert("Mật khẩu và tài khoản không đúng");
    }
    event.preventDefault();
});

// Đồng hồ
function clock() {
    let today = new Date();
    // lấy giờ
    let hour = today.getHours();
    // lấy phút
    let minute = today.getMinutes();
    //lấy giây
    let second = today.getSeconds();
    if (hour < 10) {
        hour = "0" + hour;
    }
    if (second < 10) {
        second = "0" + second;
    }
    if (minute < 10) {
        minute = "0" + minute;
    }

    let result = hour + ":" + minute + ":" + second;
    document.getElementById("clock").innerHTML = result;
    setTimeout("clock()", 1000);
}
clock();