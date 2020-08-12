public class TestAnimal_Fruit {
    public static void main(String[] args) {
        Animal[] animals = new Animal[2];
        animals[0] = new Chicken();
        animals[1] = new Tiger();

        for (Animal animal : animals
        ) {
            System.out.println(animal.makeSound());

        }
        System.out.println("_____________________________________________________");
        Apple apple = new Apple();
        System.out.println("Do you like apple ? " + apple.howtoEat());

        Orange orange = new Orange();
        System.out.println("Do you like apple ? " + orange.howtoEat());
    }
}
