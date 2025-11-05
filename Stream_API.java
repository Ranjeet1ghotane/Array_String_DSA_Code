import java.util.*;

public class Stream_API {
    public void stramApi(){
        // List<Integer> list = Arrays.asList(5,8,4,9,6,7,6,5);
        // List<Integer>res = list.stream()
        //                        .map(n-> n*2)
        //                        .filter(n-> n % 2 == 0)
        //                        .distinct()
        //                        .collect(Collectors.toList());
        // System.out.println(res);

        List<Integer>list = Arrays.asList(8,7,5,48,5,4,6,7);
                    int sum = list.stream()
                                  .reduce(0, (a,b)->a+b);
                                   System.out.println(sum);
                                  

    }
    public static void main(String[] args) {
       Stream_API str = new Stream_API();
        str.stramApi();
    }
}
