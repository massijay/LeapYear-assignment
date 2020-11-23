package dssc.assignment.leapyear;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Multiple {
    @ParameterizedTest
    @CsvSource({
            "2, 2, true",
            "3, 2, false",
            "4, 2, true",
            "1000, 100, true",
            "2020, 100, false",
            "1900, 100, true",
            "1900, 400, false"
    })
    void multiples(int number, int divisor, boolean expected) {
        assertEquals(expected, LeapYear.isMultipleOf(number, divisor));
    }
}
