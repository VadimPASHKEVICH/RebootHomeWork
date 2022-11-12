

public class StringBuilderMain {
    public static void main(String[] args) {
//        String x = "Hello";
//        x = x.toUpperCase(); //переопределили значение х, чтобы записать слово заглавными буквами
//        System.out.println(x);
//
//        String string1 = "Hello";
//        String string2 = " my";
//        String string3 = " friend";
//        String stringAll = string1+string2+string3;
//        System.out.println(stringAll);

        StringBuilder sb = new StringBuilder("Bye");
        System.out.println(sb.toString());
        sb.append(" my");               //append это добавление к строке
        sb.append(" friend");
        sb.append(" your").append(" man"); //как вариант можно использовать так, когда нужно использовать много раз
        System.out.println(sb.toString());

    }

}
