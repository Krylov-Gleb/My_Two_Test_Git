import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegX_number_Four {
    public static void main(String[] args) {

        String Text = "пммирчдаирvdldjkvnsd59458";

        Pattern pattern = Pattern.compile("^[\\w]+$");
        Matcher matcher = pattern.matcher(Text);

        System.out.println("\nНаша строка = " + Text);

        while(matcher.find()){

            System.out.println("\nСтрока не содержит лишние символы!");

        }

    }
}
