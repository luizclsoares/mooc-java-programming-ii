
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> list = new ArrayList<>();
        
        list.add(-4);
        list.add(3);
        list.add(7);
        list.add(4);
        list.add(-9);
        list.add(2);
        list.add(6);
        
        List<Integer> positiveNumbers = positive(list);
        System.out.println(positiveNumbers);
    }

    public static List<Integer> positive(List<Integer> numbers) {
        return numbers.stream()
                .filter(number -> number > 0)
                .collect(Collectors.toCollection(ArrayList::new));
    }
}
