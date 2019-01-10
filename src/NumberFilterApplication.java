import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NumberFilterApplication {
    public static void main(String[] args) {
        List<Integer> mixNumbs = makeListOfMixedNumbers();
        NumberFilter numberFilter =new NumberFilter();
        numberFilter.getEven(mixNumbs);
        numberFilter.getOdd(mixNumbs);
//        Predicate<Integer> conditionEven = integer -> integer % 2 == 0;
//        numberFilter.filterNums(conditionEven, mixNumbs);
    }

    private static List<Integer> makeListOfMixedNumbers() {
        List<Integer> mixedNumbers = new ArrayList<>();
        mixedNumbers.add(0);
        mixedNumbers.add(1);
        mixedNumbers.add(2);
        mixedNumbers.add(3);
        mixedNumbers.add(4);
    return mixedNumbers;}

}
