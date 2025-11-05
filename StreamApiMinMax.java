import java.util.*;
public class StreamApiMinMax {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(4,5,7,1,2,3,654,5,45,8,45,8);
        Integer maxNumber = list.stream()
                                .max(Integer::compare)
                                .get();
                                System.out.println(maxNumber);

        Integer minNumber = list.stream()
                                .min(Integer::compare)
                                .get();
                                System.out.println(minNumber);

    }
}
