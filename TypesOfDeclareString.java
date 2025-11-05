import java.util.*;

public class TypesOfDeclareString {
    public static void main(String[] args) {
         // case 1 - to declare a String the
        // You can Add remove and Modify elements
        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Banana");
        list.add("Chery");
        list.stream()
                .forEach(n -> System.out.println(n));


        // case 2 - to declare a String the
        // Here in Arrays.asList() we can only Modify the elements using set()
        List<String> list1 = Arrays.asList("Apples", "Apricot", "Blackberry");
        list1.stream()
                .forEach(n -> System.out.println(n));

        // case 3 - to declare a String the
        // Here in List.of() we cannot add remove modify elements
        List<String> list2 = List.of("Apples", "Apricot", "Blackberry");
        list2.stream()
                .forEach(n -> System.out.println(n));
    }
}
