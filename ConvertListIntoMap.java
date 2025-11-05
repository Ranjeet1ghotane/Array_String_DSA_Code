import java.util.*;
import java.util.stream.Collectors;

public class ConvertListIntoMap {
    public static void main(String[] args) {
        // case 1 - to declare a String the
        // You can Add remove and Modify elements
        List<String> list = new ArrayList<>();
        list.add("Mango");
        list.add("Banana");
        list.add("Chery");
            list.stream()
                .forEach(n-> System.out.println(n));

        System.out.println();
        
        Map<String, Integer> map = list.stream()
                .collect(Collectors.toMap(Value -> Value, Value -> Value.length()));
        System.out.println(map);
        
        

        
    }
}

