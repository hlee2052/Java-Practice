package streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NodeList {

    public static class Node {
        int age;
        int height;
        String name;

        public Node(int age, int height, String name) {
            this.age = age;
            this.height = height;
            this.name = name;
        }

        public void setHeight(int height) {
            this.height = height;
        }

        public int getFakeHeight() {
            return 100;
        }

        public int getHeight() {
            return height;
        }
    }


    public static void main(String[] args) {

        List<String> words = Arrays.asList("a1", "a2", "b1", "b2", "b3");

        // prints B1 B2 B3
        words.stream()
                .filter(s -> s.contains("b"))
                .map(String::toUpperCase) // equivalent to map(s -> s.toUpperCase())
                .sorted()
                .forEach(System.out::println); // equivalent to forEach(s -> System.out.println(s))

        // prints a1
        words.stream()
                .findFirst()
                .ifPresent(System.out::println);

        // prints 14  --> [12, 14, 18]
        Arrays.stream(new int[]{4, 5, 6})
                .map(n -> 2 * n + 4)
                .average()
                .ifPresent(System.out::println);


        Stream.of("a1", "a2", "a3")
                .map(s -> s.substring(1))
                .mapToInt(s -> Integer.parseInt(s))
                .max()
                .ifPresent(System.out::println);  // 3

        IntStream.range(1, 4)
                .mapToDouble(i -> i)
                .mapToObj(i -> "a" + i)
                .forEach(System.out::println);

        Stream.of("d2", "a2", "b1", "b3", "c")
                .filter(s -> {
                    System.out.println("filter: " + s);
                    return true;
                })
                .forEach(s -> System.out.println("forEach: " + s));


        List<Node> listNode = new ArrayList<>();
        listNode.add(new Node(1, 4, "John"));
        listNode.add(new Node(4, 2, "Abby"));
        listNode.add(new Node(3, 4, "Phillip"));
        listNode.add(new Node(10, 10, "Tyler"));

        listNode.stream()
                .filter(s->s.getHeight()>3)
                .forEach(s -> System.out.println(s.height));


        listNode.stream()
                .map(s->s.getHeight());
        
        listNode.stream()
                .map(s -> {
                    s.setHeight(-1);
                    return s;
                })
                .forEach(s->System.out.println(s.getHeight()));

        System.out.println(listNode.get(0).getHeight());

    }
}
