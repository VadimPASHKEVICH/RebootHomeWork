package ООП;

public class Main {
    public static void main(String[] args) {
        //ООП: классы и объекты
        Transport BMW = new Transport();
//        BMW.speed = 250;
//        BMW.weight = 2400;
//        BMW.color = "Blue";
//        BMW.coordinate = new byte[]{0,0,0};
        BMW.setValues(250, 2400, "Blue", new byte[]{0,0,0});
        String res1 = BMW.getValues();
        System.out.println(res1);

        Transport MAN = new Transport();
        MAN.speed = 150;
        MAN.weight = 7800;
        MAN.color = "Silver";
        MAN.coordinate = new byte[]{100,0,100};
        String res2 = MAN.getValues();
        System.out.println(res2);

//        System.out.println("MAN speed: " + MAN.speed + ". BMW speed: " + BMW.speed);
    }
}
