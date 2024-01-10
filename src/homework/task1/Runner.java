package homework.task1;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<Integer> randomInt = new ArrayList<>();
        for(int i = 0; i <=20; i++) {
            randomInt.add(i, (int)(Math.random() * 10));
        }
        System.out.println(randomInt);
        System.out.println("Removing duplicates " + randomInt.stream().distinct().toList());
        System.out.println("Even numbers from 7th to 17th position " + randomInt.stream().skip(6).limit(11).filter(n -> n%2 ==0).toList());
        System.out.println("Multiplying each element " + randomInt.stream().map(n -> n * 2).toList());
        System.out.println("Sorting and outputting the first 4 elements " + randomInt.stream().sorted().limit(4).toList());
        System.out.println("Number of elements in stream " + randomInt.stream().count());
        System.out.println("Average value " + randomInt.stream().collect(Collectors.averagingInt(i -> i)));
    }
}
