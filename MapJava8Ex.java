package java8_map;

import java.util.List;
import java.util.stream.Collectors;

public class MapJava8Ex {
    public static void main(String[] args) {
        List<String> list = List.of("pankaj","dhiraj","Niraj");
        list.stream()
            .map(s->s+" Brother")
            .collect(Collectors.toList())
            .forEach(System.out::println);
    }
}
