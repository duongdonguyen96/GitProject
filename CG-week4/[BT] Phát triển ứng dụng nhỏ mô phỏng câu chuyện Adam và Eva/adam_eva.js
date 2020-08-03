class Apple {
  constructor(name, weight) {
    this.weight = weight;
    this.name = name;
  }

  decrease() {
    if (this.isEmpty) {
      this.weight = this.weight - 1;
    }
  }
  isEmpty() {
    if (this.weight > 0) {
      return true;
    } else {
      return false;
    }
  }

  getWeight() {
    return this.weight;
  }
  getInfor2() {
    return "Name:" + this.name + "<br>" + "Weight:" + this.weight;
  }
}

class Human {
  constructor(name, gender, weight) {
    this.name = name;
    this.gender = gender;
    this.weight = weight;
  }
  getName() {
    return this.name;
  }
  setName() {
    this.name = name;
  }
  sayHi() {
    console.log(
      "Hi! iam " + this.name,
      "my gender is" + this.gender,
      " my weight is " + this.weight
    );
  }
  isMale() {
    return this.gender;
  }
  eatApple(apple) {
    if (this.checkApple(apple)) {
      this.weight += 1;
      apple.decrease();
    } else {
      alert("Táo hết");
    }
  }
  // if (this.checkApple(apple)) {
  //   console.log("Táo hết");
  // } else {
  //   console.log("name: " + this.name + "  ăn táo");
  //   this.weight += 1;
  //   apple.decrease();

  getWeight() {
    return this.weight;
  }
  setWeight() {
    this.weight = this.weight + 1;
  }
  getInfor1() {
    return "Name:" + this.name + "<br>" + "Weight:" + this.weight;
  }
  checkApple(apple) {
    return apple.isEmpty();
  }
}
let adam = new Human("Adam", true, 69);
let eva = new Human("Eva", false, 45);
let apple = new Apple("apple", 10);
// let x = adam.getInfor();
document.getElementById("object1").innerHTML = adam.getInfor1();
document.getElementById("object2").innerHTML = eva.getInfor1();
document.getElementById("object3").innerHTML = apple.getInfor2();
let check = false;
function eatApple(name) {
  switch ((name, check)) {
    case ("adam", true):
      adam.eatApple(apple);
      check = false;
      break;
    case ("eva", false):
      eva.eatApple(apple);
      check = true;
      break;
  }

  document.getElementById("object1").innerHTML = adam.getInfor1();
  document.getElementById("object2").innerHTML = eva.getInfor1();
  document.getElementById("object3").innerHTML = apple.getInfor2();
}
