import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by admin on 9/18/2014.
 *
 * @author Raghavendra Balgi
 * @since 18th September 2014
 */
public class Main {

    private static final int HELP = 0;


    public static void main(String[] args) {

        System.out.println("Hello World");

        List<Integer> intList=Arrays.asList(1,2,3,4,12,5,6,7,8,9,10);
        System.out.println(intList.stream().filter(Main::isEven).mapToInt(x->x).sum());


    }

    private static boolean isEven(Integer integer) {
        System.out.println("called");
        return integer%2==0;
    }
}
