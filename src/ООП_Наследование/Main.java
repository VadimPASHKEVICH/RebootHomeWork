package ООП_Наследование;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
//        animal.eat();
//        animal.sleep();                         // в самом main мы вызываем методы
        Dog dog = new Dog();
//      dog.sleep();
//      dog.eat();                              // класс Dog наследует класс Animal и соответственно использует методы
//                                                //  класса Animal
        dog.bark();
        dog.eat();
        dog.showName();
    }
}
