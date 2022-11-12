import java.util.logging.SocketHandler;

/**Конструктор это методы которые вызываются при создании нового объекта. Задает объекту атрибуты,
 * инициализирует его поля. Конструктор отличается от метода тем, что у него нет типа возвращаемого значения
 */
public class Constructor {
    public static void main(String[] args) {
        Human2 human2 = new Human2("Bob", 20);

    }
}
class Human2 {
    private String name;
    private int age;
    public Human2(String name, int age) {   //Конструктор для инициализации и присвоения данный в методе main
        this.name = name;
        this.age = age;
        System.out.println("Привет я работаю с конструктором Java");

    }
    //Ключевое слово final - используется для обозначения переменной которая не может изменяться(т.е. константа)
    //константы всегда делают static (статичными). Используется только тогда, когда мы хотим, чтобы какие-то данные
    //не изменялись.

    class Test{
        public static final int CONSTANT = 0;
        }
    }

