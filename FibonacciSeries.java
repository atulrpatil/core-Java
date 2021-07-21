import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FibonacciSeries {
    public static void main(String[] args) {

        //Start -- Below is Anagram program
        String s1 = "army";
        String s2 = "mary";

        char[] char1 = s1.toCharArray();
        char[] char2 = s2.toCharArray();

        Arrays.sort(char1);
        Arrays.sort(char2);

        if (Arrays.equals(char1, char2)) {
            System.out.println("It's anagram");
        }
        //End -- Below is Anagram program


        //Start -- Fibonacci Series program
        Stream.iterate(new long[]{0, 1}, p -> new long[]{p[1], p[0] + p[1]})
                .limit(10).forEach(p -> {
            System.out.println(p[0]);
        });
        //End -- Fibonacci Series program

        //Start -- Below code of line is for converting lambda expression into method reference
        Employee employee1 = new Employee(100, "Satyam");
        Employee employee2 = new Employee(101, "Sam");
        Employee employee3 = new Employee(102, "Satya");
        Employee employee4 = new Employee(103, "Atul");
        List<Employee> employeeList1 = new ArrayList<>();
        employeeList1.add(employee1);
        employeeList1.add(employee2);
        employeeList1.add(employee3);
        employeeList1.add(employee4);

        List<Employee> employeeList2 = new ArrayList<>();
        employeeList1.add(employee1);
        employeeList1.add(employee2);
        employeeList1.add(employee3);
        employeeList1.add(employee4);

//      List<Employee> employees = employeeList1.stream().filter(emp1 -> employeeList2.contains(employee1)).collect(Collectors.toList());
        List<Employee> employees = employeeList1.stream().filter(employeeList2::contains).collect(Collectors.toList());
        Stream.of(1, 2, 3, 4, 5, 6).forEach(System.out::println);
//        Stream.of(1, 2, 3, 4, 5, 6).forEach(x -> System.out.println(x));
        System.out.println(employees);
        //End -- Below code of line is for converting lambda expression into method reference

        if (s1.equals(s2)) {
            System.out.println("It's equal with equal()");
        }

        if (s1 == s2) {
            System.out.println("It's equal with == operator");
        }

    }

}
