package ООП_Полиморфизм;

public class Main2 {
    public static void main(String[] args) {
        Animal2 animal2 = new Cat();
        animal2.eat();

        Cat cat = new Cat();
        cat.eat();
        cat.meow();


    }
}
