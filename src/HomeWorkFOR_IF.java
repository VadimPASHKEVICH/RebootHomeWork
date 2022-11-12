import java.util.Scanner;

public class HomeWorkFOR_IF {
    public static void main(String[] args) {

        for (int i = 0; i <= 99; i++) {               //задали цикл(условия)
            if (i % 2 != 0) {                        // полученные результат i делим на 2, чтобы получить нечетные числа
                System.out.println("Вывести только нечетные числа " + i);
            }
        }
        for (int i = 5; i > 0; i--) {                //обратный порядок
            System.out.println("Обратный порядок " + i);
        }
        System.out.println();
        System.out.println("Введите любое целое число");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();                  //считывание с консоли введенное целое число
        int sum = 0;                    // в переменную sum будут суммироваться числа с помощью цикла for
        for (int i = 1; i <= n; i++) {      //условие задачи начало от 1, где n - введенное пользователем число
            sum = sum + i;
        }
        System.out.println(sum);

        int a = 7;                                      //объявление переменной за заданным параметром
        while (a <= 98) {                                 //счетчик, который будет считать до...
            System.out.println("Последовательность " + a);
            a += 7;                                       //увеличение переменной (обязательно +=, т.к. а=а+7)
        }
        int e = 0;                                      //переменная с заданным параметром в данном случае 0
        while (e > -46) {                                //отсчитал вручную??
            System.out.println(e);
            e -= 5;                                     //уменьшение на заданное кол-во
        }
        System.out.println();
        for (int j = 10; j <= 20; j++) {                //квадраты чисел от 10 до 20
            System.out.println("Квадраты " + (j * j));
        }
        System.out.println("Введите число");
        Scanner scanner1 = new Scanner(System.in);
        int n1 = scanner1.nextInt();
        if (n1 % 2 == 0) {
            System.out.println("Вы ввели четное число");
        } else {
            System.out.println("Вы ввели не четное число");
        }
        System.out.println();
        System.out.println("Какая температура на улице");

        int temp = scanner1.nextInt();                      //необязательно вводить новый сканер
        if (temp > -5) {
            System.out.println("Тепло");
        } else if (temp <= -5 && temp > -20) {          //Логический оператор && (И) возвращает true, если слева и справа от него стоят значения true,
            System.out.println("Нормально");
        } else if (temp <= -20) {
            System.out.println("Холодно");
        }

        Scanner s = new Scanner(System.in);
        System.out.println("введите число");
        int n0 = scanner.nextInt();  //объявление переменной "n" - считываем с консоли введенное число
        int sum0 = 0;
        for (int i = 1; i <= n; i++) {    //числа суммируются от 1 до введенного числа "n"
            sum = sum + i; // в переменную sum суммируются числа с помощью цикла for
        }
        System.out.println(sum);
    }
}

