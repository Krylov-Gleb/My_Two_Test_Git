import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegX_number_Two {
    public static void main(String[] args) throws FileNotFoundException {

        String Text = "";

        File file = new File("Text.txt");
        Scanner scanner = new Scanner(file);

        while(scanner.hasNextLine()){
            Text = Text + scanner.nextLine();
        }

        scanner.close();

        String[] Array_Split = Text.split("\\.");

        int count_true_element = 0;

        for(int i = 0; i < Array_Split.length; i++){

            String Begin_Text_Element = Array_Split[i];

            Pattern pattern = Pattern.compile("^[A-zА-я]{5}");
            Matcher matcher = pattern.matcher(Begin_Text_Element);

            while (matcher.find()){

                System.out.println(matcher.group());
                count_true_element++;

            }

        }

        System.out.println("\nКоличество элементов = " + count_true_element);



    }
}
