import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegX_number_Three {
    public static void main(String[] args) throws FileNotFoundException {

        String Text = "";

        File file = new File("Text.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            Text = Text + scanner.nextLine();
        }

        scanner.close();

        String[] Array_Split = Text.split("\\.");

        for(int i = 0; i < Array_Split.length; i++){

            Pattern pattern = Pattern.compile("( |\\w)или(\\w| |:)");
            Matcher matcher = pattern.matcher(Array_Split[i]);
            StringBuffer sb = new StringBuffer();

            while(matcher.find()){

                String Rep = "ou";
                matcher.appendReplacement(sb,Rep);

            }

            matcher.appendTail(sb);
            System.out.println(sb);

        }

    }
}
