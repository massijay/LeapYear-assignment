package dssc.assignment.leapyear;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Leap {
    @ParameterizedTest
    @CsvSource({
            "1600, true",
            "2000, true",
            "2400, true",
            "1700, false",
            "1800, false",
            "1900, false",
            "2004, true",
            "2012, true",
            "2020, true",
            "1998, false",
            "1999, false",
            "2001, false"
    })
    void leapYears(int year, boolean expected) {
        assertEquals(expected, LeapYear.isLeapYear(year));
    }

    @ParameterizedTest
    @CsvSource({
            "1900, 1900: not leap year",
            "1996, 1996: leap year",
            "2020, 2020: leap year"
    })
    void printYears(int year, String expected)
    {
        assertEquals(expected, LeapYear.printYear(year));
    }
}
