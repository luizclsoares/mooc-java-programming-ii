
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> strings = new ArrayList<>();
        
        while(true){
            String string = scanner.nextLine();
            
            if(string.isEmpty()){
                break;
            }
            
            strings.add(string);
        }
        
        strings.stream().forEach(string -> System.out.println(string));
    }
}
