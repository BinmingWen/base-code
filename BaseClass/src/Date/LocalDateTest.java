package Date;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class LocalDateTest {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        System.out.println(ld);
        System.out.println(ld.getYear());
        System.out.println(ld.getMonth());
        System.out.println(ld.getDayOfMonth());
        System.out.println("======");
        LocalDate ld2 = LocalDate.of(2008, 8, 8);
        System.out.println(ld2.getYear());
        System.out.println(ld2.getMonth());
        System.out.println(ld2.getDayOfMonth());
        System.out.println("====");
        LocalDate localDate = ld.plusMonths(2);
        System.out.println(localDate.getMonth());
        LocalDate ld3 = ld.minusYears(1);
        System.out.println(ld3.getYear());

    }
}
