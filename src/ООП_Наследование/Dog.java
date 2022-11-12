package ООП_Наследование;

public class Dog extends Animal {               /** класс Dog наследуется от класса Animal. Класс Animal является родителем
                                                 класса Dog*/
    public void eat(){                          //происходит переопределние методов
        System.out.println("Dog is eating");
    }
    public void bark(){
        System.out.println("I am barking");
    }
    public void showName(){
        System.out.println(name);
    }
}
