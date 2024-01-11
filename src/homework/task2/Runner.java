package homework.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Runner {
    public static void main(String[] args) {
        List<String> name = new ArrayList<>();
        name.add("Dmitriy");
        name.add("Polina");
        name.add("Mark");
        name.add("Daniil");
        name.add("Liisa");
        name.add("Stepan");
        name.add("Artur");
        name.add("Ivan");
        name.add("Andrey");
        name.add("nameTG: Strfend");
        name.add("Sergey");

        String firstname = String.valueOf(name.stream().sorted().findFirst());
        System.out.println(firstname);
        List<String> collect2 = name.stream().filter(n -> n.toLowerCase().charAt(0) == 'a').collect(Collectors.toList());
        System.out.println(collect2);
    }
}
