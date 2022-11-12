public class For_If {
    public static void main (String[]args) {
        for(int i = 0; i<=10; i++){                          //Цикл for
            System.out.println("Hello "+ i);
        }
        System.out.println();
        for ( int i = 10; i>=0; i= i-5){                    //инициализация в обратную сторону
            System.out.println("Hello "+ i);
        }
        System.out.println();

                                                            //Цикл if

        if(5<5) {                                           //если условия в скобках верно, то цикл срабатывает
            System.out.println("да, верно");
        }else {                                             //если условия в цикле if не верно, срабатывает else
            System.out.println("нет, не верно");
        }
        System.out.println();
        int myInt = 15;                                     //if - else if - else
        if(myInt<10){
            System.out.println("да, верно");
        }
        else if(myInt>20){
            System.out.println("нет, не верно");
        }
        else {
            System.out.println("ни один из предыдущих случаев"); //выполняется, если ни одно условие не подошло
        }
    }
}
