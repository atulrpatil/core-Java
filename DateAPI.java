import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateAPI {
    public static void main(String[] args) {
        LocalDate localDate = LocalDate.now();
        System.out.println(localDate);

        LocalTime localTime = LocalTime.now();
        System.out.println(localTime);

        LocalDateTime localDateTime = LocalDateTime.now();
        System.out.println(localDateTime);

        String s = new String("abc");
//        s.intern();

        String s1 = "abc";
        String s2 = "abc";
//
//        if (s1 == s) {
//            System.out.println(s1 == s);
//        }
//
//
//        if (s1.equals(s)) {
//
//        }

        int i = 1;
        while (i < 10) {
            System.out.println("i : " + i);
            i++;
        }

        if (i < 10) {
            System.out.println("i : " + i);
        }

    }
}
