import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegX_numberEight {
    public static void main(String[] args) {

        String R = "Операционные системы и среды ПР 1-15 Мурылёв В.Р. ауд. 104/2\n" +
                "Операционные системы и среды ЛК 0-16 Мурылёв В.Р. ауд. 102/2\n" +
                "Элементы высшей математики ПР 1-15 доц. Кутарова Е.И. ауд. 303/2\n" +
                "Элементы высшей математики ЛК 0-14 доц. Кутарова Е.И. ауд. 318/2\n" +
                "Разработка мобильных приложений ПР 1-15 преп. Панкратов Д.А. ауд. 410/2\n" +
                "Физическая культура ПР 0-15 преп. Кириллов С.С. Зал";

        Pattern pattern = Pattern.compile("\\D+(ПР|ЛК)");
        Matcher matcher = pattern.matcher(R);

        Pattern pattern1 = Pattern.compile("[0-20]-[0-9][0-9]");
        Matcher matcher1 = pattern1.matcher(R);

        Pattern pattern2 = Pattern.compile("[А-яё]+( |.)[А-я]\\.[А-я]\\.");
        Matcher matcher2 = pattern2.matcher(R);

        System.out.println("\nНазвание дисциплин: \n");

        while(matcher.find()){

            System.out.print(matcher.group());

        }

        System.out.println("\n\nПродолжительность дисциплин: \n");

        while(matcher1.find()){

            System.out.println(matcher1.group());

        }

        System.out.println("\nРуководитель: \n");

        while(matcher2.find()){

            System.out.println(matcher2.group());

        }

        System.out.print("\n");

    }
}
