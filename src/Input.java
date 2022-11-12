import java.util.Scanner;

public class Input {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);       //()<= параметры класса задается входной поток System in
        System.out.println("введите что-нибудь");
        int x = scanner.nextInt();
//        String string = scanner.nextLine();             //у объекта класса Сканер вызвали считывание с клавиатуры
//        System.out.println("вы ввели "+ string);
        System.out.println("вы ввели " + x);
                                                        //Цикл while
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Введи 5");
        int value = scanner1.nextInt();
        while (value !=5) {                              // != не равно
            System.out.println("Введи 5");
            value = scanner1.nextInt();
        }
        System.out.println("Вы ввели 5");               // данный цикл while будет выполняться пока не выполнится значение

                                                        // Цикл do...while отличие от while: "do" сначала выполняет инструкции
                                                        // а затем проверяет условия "while"
        Scanner scanner2 = new Scanner(System.in);
        int value1;
        do{
            System.out.println("введи 5");
            value1 = scanner2.nextInt();
        }while (value1!=5);
        System.out.println("Вы ввели ");
    }
}
