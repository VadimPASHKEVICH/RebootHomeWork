package Collection;
import java.util.*;

public class Test {
    public static void main(String[] args) {
//        ArrayList<Integer> arrayList = new ArrayList<>();            //<> в скобках пишется тип хранимых объектов
//                                                                    //в скобках можно использовать только ссылочные типы,
//                                                                    //  а не примитивы(Integer а не int)
//        for (int i = 0; i < 10; i++) {
//            arrayList.add(i);
//        }
//        System.out.println(arrayList);
//
////        //метод get с помощью его мы можем получить элемент по индексу
////        System.out.println(arrayList.get(0));
////        System.out.println(arrayList.get(99));
////
////        //метод size с помощью этого метода мы можем получить размер ArrayList
//        System.out.println(arrayList.size());
////
////        //способы(методы) с помощью которых можно проходить по элементам ArrayList
//        for (int i = 0; i < arrayList.size(); i++) {
//            System.out.println(arrayList.get(i));               //в метод get передается счетчик i
//        }
//
//        // метод удаление элементов в ArrayList
//        arrayList.remove(5);
//        System.out.println(arrayList);
//
//
//        //метод добавления элементов
//        arrayList.add(5);
//        System.out.println(arrayList);

        List<String> fruits = new ArrayList<>();
        fruits.add("яблоко");
        fruits.add("груша");
        fruits.add("апельсин");
        fruits.add("яблоко");

        System.out.println(fruits);
        //отличие от ArrayList LinkedList построен на базе связанных друг с другом элементов каждый элемент
        //ссылку на следующий элемент и предыдущий (цепочка из элементов) и требуется пройти по всей цепочке
        // элементов, пока не дойдем до нужного элемента.

        List<String> fruits2 = new LinkedList<>();
        fruits2.add("яблоко");
        fruits2.add("груша");
        fruits2.add("апельсин");
        fruits2.add("яблоко");

        System.out.println(fruits2);

        // Set collection переводится как набор и не допускает кол-во дублей
        Set<String> fruits3 = new HashSet<>();  //HashSet не сохраняет порядок выводимых переменных
        fruits3.add("яблоко");
        fruits3.add("груша");
        fruits3.add("апельсин");
        fruits3.add("яблоко");

        System.out.println(fruits3);

        Set<String> fruits4 = new LinkedHashSet<>();// не допускает дублей, реализует интерфейс Set, но при этом сохраняет порядок доабавления
        fruits4.add("яблоко");
        fruits4.add("груша");
        fruits4.add("апельсин");
        fruits4.add("яблоко");

        System.out.println(fruits4);

        Set<String> fruits5 = new TreeSet<>(); //содержит внутри себя дерево и позволяет сортировать элементы по возрастранию
        fruits5.add("яблоко");
        fruits5.add("груша");
        fruits5.add("апельсин");
        fruits5.add("яблоко");

        System.out.println(fruits5);

        // Map представляет отображение или иначе говоря словарь, где каждый элемент представляет пару "ключ-значение"
    }


    }


