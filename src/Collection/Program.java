package Collection;
import java.util.ArrayList;
import java.util.LinkedList;

public class Program {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(5);
        numbers.add(50);
        numbers.add(1, 30);         //добавление одного конкретного элемента

//        System.out.println(numbers.size());
        System.out.println(numbers.get(1));

        for(Integer el: numbers) {
            System.out.println(el);
        }

        LinkedList<Float> numbers1 = new LinkedList<>();

    }
}
