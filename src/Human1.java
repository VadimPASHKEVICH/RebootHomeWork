
public class Human1 {
    public static void main(String[] args) {
        Human human1 = new Human();
        Human human2 = new Human();

        human1.setAge(18);
        human1.setName("Tom");
        human1.getInfo();

        human2.setAge(28);
        human2.setName("Bob");
        human2.getInfo();
    }
}
    class Human { //Ключевое слово this используется чтобы внутри метода в классе обратиться к переменным класса
    //this вызывает объект внутри класса
        String name;
        int age;
        public void setName(String name) {     //в параметры передаем строку с названием имени (метод set задает параметры)
            this.name = name;
        }
        public void setAge(int age) {
            this.age = age;
        }
        public String getName() {
            return name;
        }
        public int getAge() {
            return age;
        }
        public void getInfo(){
            System.out.println(name+","+age);
        }
    }
