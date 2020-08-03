class Human {
  constructor(name, gender, weight) {
    this.name = name;
    this.gender = gender;
    this.weight = weight;
  }
  isMale() {
    return this.gender;
  }
  setGender(gender) {
    this.gender = gender;
  }
  checkApple(apple) {
    return apple.isEmpty();
  }
  eatApple(apple) {
    if (this.checkApple(apple)) {
      console.log("Táo hết");
    } else {
      console.log("name: " + this.name + "  ăn táo");
      this.weight += 1;
      apple.decrease();
    }
  }
  say(str) {
    console.log("bala bala bêlee");
  }
  getName() {
    return this.name;
  }
  setName(name) {
    this.name = name;
  }
  getWeight() {
    return this.weight;
  }
  setWeight(weight) {
    this.weight = weight;
  }
}
class Apple {
  constructor() {
    this.weight = 10;
  }
  decrease() {
    this.weight -= 1;
  }
  isEmpty() {
    if (this.weight <= 0) return true;
    return false;
  }
  getWeight() {
    return this.weight;
  }
}
let app1 = new Apple();
console.log(app1);
let human1 = new Human("Adam", true, 69);
let human2 = new Human("Eva", false, 60);
human1.eatApple(app1);
let first = false;
for (; app1.getWeight() > 0; ) {
  if (first) {
    human1.eatApple(app1);

    console.log(human1.getWeight());
  } else {
    human2.eatApple(app1);

    console.log(human2.getWeight());
  }
  first = !first;
}
