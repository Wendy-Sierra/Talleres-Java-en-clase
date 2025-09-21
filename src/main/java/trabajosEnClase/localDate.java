package trabajosEnClase;

import java.time.LocalDate;

public class localDate {
    public static void main(String[] args) {
        //Que dia es mañana
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate.plusDays(1));

        //Que mes es el proximo mes
        LocalDate localMonth = LocalDate.now();
        System.out.println(localMonth.plusMonths(1).getMonthValue());

        //Que año es el proximo año
        LocalDate localYear = LocalDate.now();
        System.out.println(localYear.plusYears(1).getYear());
    }

}
