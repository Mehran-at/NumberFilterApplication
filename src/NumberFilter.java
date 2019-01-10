import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class NumberFilter {
    public List<Integer> filterNums (Predicate<Integer> condition, List<Integer> mixedNumbs) {
        List<Integer> filteredNums = new ArrayList<>();
        for (Integer num : mixedNumbs) {
            if (condition.test(num)) {
                filteredNums.add(num);
            }
        }
        System.out.println(filteredNums);
        return filteredNums;
    }
    List<Integer> getEven (List<Integer> mixedNumbs) {
        Predicate<Integer> conditionEven = integer -> integer % 2 == 0;
        return filterNums(conditionEven, mixedNumbs);
    }
    List<Integer> getOdd (List<Integer> mixedNumbs) {
        Predicate<Integer> conditionOdd = integer -> integer % 2 !=0;
        return filterNums(conditionOdd, mixedNumbs);
    }
}




//public class NumberFilter {
//    public static void main(String[] args) {
//            List<Integer> numbers = new ArrayList<>();
//            numbers.add(1);
//            numbers.add(0);
//            numbers.add(13);
//            numbers.add(14);
//            numbers.add(15);
//            numbers.add(16);
//            List<Integer> oddNumbers = new ArrayList<>();
//            List<Integer> evenNumbers = new ArrayList<>();
//            for (Integer number : numbers) {
//                if (number % 2 != 0) {
//                    oddNumbers.add(number);
//                }
//                if (number % 2 == 0) {
//                    evenNumbers.add(number);
//                }
//            }
//        System.out.println("Filtered odd Numbers: " + oddNumbers);
//        System.out.println("Filtered even Numbers: " +evenNumbers);
//        }
//    }


