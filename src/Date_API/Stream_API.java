package Date_API;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Stream_API {
    public static void main(String[] args) {
        Random random = new Random();
        int size = random.nextInt(10,60);
        ArrayList<Integer> arrayList = new ArrayList<>(size);

        for (int i = 0; i < size; i++){
            arrayList.add(random.nextInt(1,20));
        }
        System.out.println(arrayList);

        List<Integer>result = arrayList.stream().distinct().toList();
        System.out.println("No duplicates "+ result);

        result = arrayList.stream().filter(i -> i >= 7 && i < 17 && i % 2 == 0).toList();
        System.out.println("Even elements in range from 7 to 17: "+ result);

        result = arrayList.stream().map(i -> i * 2).toList();
        System.out.println("Multiply each element by 2 "+ result);

        result = arrayList.stream().sorted(Integer::compareTo).limit(4).toList();
        System.out.println("First 4 sorted elements "+ result);

        long count = arrayList.stream().count();
        System.out.println("The number of elements in the stream "+ count);

        double avg = arrayList.stream().mapToInt(x -> x).average().getAsDouble();
        System.out.println("Arithmetic mean in the stream " + avg);
        }

    }
