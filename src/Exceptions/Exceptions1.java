package Exceptions;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exceptions1 {
    public static void main(String[] args) throws FileNotFoundException {
//        File file = new File("Ffff");
//        try {                               //в этом блоке мы пытаемся выполнить часть кода
//            Scanner scanner = new Scanner(file);
//
//        } catch (FileNotFoundException e) {     // если блок try не выполняется, здесь задается исключение (ловим его)
//            System.out.println("Файл не найден");
//    //после обработки исключения код выполняется дальше
//        }
//        System.out.println("После блока try catch");
        try {
            readFile();
        }catch (FileNotFoundException e){
            System.out.println("Обработка исключения в методе main.");
        }
    }

    public static void readFile() throws FileNotFoundException {
        File file = new File ("test");
        Scanner scanner = new Scanner(file);
    }
}
