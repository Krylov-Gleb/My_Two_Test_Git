import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegX_number_Siz {
    public static void main(String[] args) {

        System.out.print("Введите математическое выражение: ");
        Scanner scanner = new Scanner(System.in);

        String Text_Mat = scanner.nextLine();

        Pattern pattern = Pattern.compile("\\d[-\\/*]");
        Matcher matcher = pattern.matcher(Text_Mat);

        while(matcher.find()){

            System.out.println(matcher.group());

        }

    }
}
