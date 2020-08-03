function StudentApp(name, age, email) {
  this.name = name;
  this.age = age;
  this.email = email;
}

function Screen() {
  this.addStudent = function (student) {
    let student_list = document.getElementById("student-list");
    let row = document.createElement("tr");

    row.innerHTML = `
        <td>${student.name}</td>
        <td>${student.age}</td>
        <td>${student.email}</td>
        <td><a href="#" class="fa fa-trash"></a></td>
        `;

    student_list.appendChild(row);
  };

  this.clearInput = function () {
    document.getElementById("name").value = "";
    document.getElementById("age").value = "";
    document.getElementById("email").value = "";
  };

  this.deleteStudent = function (target) {
    if (target.className === "fa fa-trash") {
      target.parentElement.parentElement.remove();
    }
  };
}

document
  .getElementById("student-form")
  .addEventListener("submit", function (event) {
    let name = document.getElementById("name").value,
      age = document.getElementById("age").value,
      email = document.getElementById("email").value;

    if (name === "" || age === "" || email === "") {
      alert("Lỗi input");
    } else {
      let student = new StudentApp(name, age, email);

      let screen = new Screen();
      screen.addStudent(student);
      screen.clearInput();
    }

    event.preventDefault();
  });

document.getElementById("student-list").addEventListener("click", function (e) {
  let screen = new Screen();
  screen.deleteStudent(e.target);
});
