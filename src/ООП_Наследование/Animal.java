package ООП_Наследование;
public class Animal {                           //Наследование
    String name = "Some animal";
    public void eat(){                          //Задаются методы (void) для общего класса животных
        System.out.println("Animal is eating");
    }
    public void sleep(){
        System.out.println("Animal is sleeping");
    }
    /**Принцип наследования в том, что в случае нескольких классов, имеющие общие методы
     *  не нужно будет писать для каждого класса (в данном случае животные) методы в целом (по отдельности) мы просто
     *  наследуемся от общего класса Animal extends (наследование).
     */

}
