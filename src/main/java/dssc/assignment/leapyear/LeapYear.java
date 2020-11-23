package dssc.assignment.leapyear;

import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class LeapYear {
    public static void main(String... args) {
        print(1899, 2001);
    }

    public static boolean isMultipleOf(int number, int divisor) {
        return number % divisor == 0;
    }

    public static boolean isLeapYear(int year) {
        if (isMultipleOf(year, 400)) return true;
        if (isMultipleOf(year, 100)) return false;
        return isMultipleOf(year, 4);
    }

    public static String printYear(int year) {
        return year + ": " + (isLeapYear(year) ? "" : "not ") + "leap year";
    }

    public static void print(int fromInclusive, int toInclusive) {
        Stream<String> results = IntStream.rangeClosed(fromInclusive, toInclusive)
                .mapToObj(LeapYear::printYear);

        System.out.println(results.collect(Collectors.joining(System.lineSeparator())));
    }
}
