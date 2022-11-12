package ООП_Инкапсуляция;

public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();
        person1.setName("Какое-то имя");
        person1.setAge(12);
        System.out.println("Выводим значение в main методе: " + person1.getName());
        System.out.println("Выводим значение в main методе: " + person1.getAge());
        person1.speak();

    }
}
class Person {
    private String name;
    private int age;

    public void setName(String userName) {
        this.name = userName;
    }
    public String getName(){
        return name;
    }

    public void setAge(int userAge){
        this.age = userAge;
    }
    public int getAge(){
        return age;
    }

    int calculateYears(){
        int years = 65 - age;
        return years;
    }
    void speak(){
        for (int i = 0; i<3; i++){
            System.out.println("Меня зовут " + name +",мне "+ age +" лет");
        }
        }
    }
