import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegX_number_Five {
    public static void main(String[] args) {

        String Text_PQ = "p";

        Pattern pattern = Pattern.compile("p(q+|)");
        Matcher matcher = pattern.matcher(Text_PQ);

        while(matcher.find()){

            System.out.println("\n" + matcher.group() + "\n");
            System.out.println("Строка соответствует требованиям!");

        }



    }
}
