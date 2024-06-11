import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegX_number_Seven {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String HTML_Color = "";

        System.out.print("\nВведите HTML цвет: ");
        HTML_Color = scanner.nextLine();

        Pattern pattern = Pattern.compile("^#[0-9A-F]{6}$");
        Matcher matcher = pattern.matcher(HTML_Color);

        while(matcher.find()){
            System.out.println("HTML цвет - коректен!");
        }

    }
}
