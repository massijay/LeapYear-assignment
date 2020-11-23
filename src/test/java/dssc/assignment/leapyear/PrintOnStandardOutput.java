package dssc.assignment.leapyear;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PrintOnStandardOutput {
    private static final String LEAP_YEARS_FROM_1899_TO_2001 = "1899: not leap year\r\n1900: not leap year\r\n1901: not leap year\r\n1902: not leap year\r\n1903: not leap year\r\n1904: leap year\r\n1905: not leap year\r\n1906: not leap year\r\n1907: not leap year\r\n1908: leap year\r\n1909: not leap year\r\n1910: not leap year\r\n1911: not leap year\r\n1912: leap year\r\n1913: not leap year\r\n1914: not leap year\r\n1915: not leap year\r\n1916: leap year\r\n1917: not leap year\r\n1918: not leap year\r\n1919: not leap year\r\n1920: leap year\r\n1921: not leap year\r\n1922: not leap year\r\n1923: not leap year\r\n1924: leap year\r\n1925: not leap year\r\n1926: not leap year\r\n1927: not leap year\r\n1928: leap year\r\n1929: not leap year\r\n1930: not leap year\r\n1931: not leap year\r\n1932: leap year\r\n1933: not leap year\r\n1934: not leap year\r\n1935: not leap year\r\n1936: leap year\r\n1937: not leap year\r\n1938: not leap year\r\n1939: not leap year\r\n1940: leap year\r\n1941: not leap year\r\n1942: not leap year\r\n1943: not leap year\r\n1944: leap year\r\n1945: not leap year\r\n1946: not leap year\r\n1947: not leap year\r\n1948: leap year\r\n1949: not leap year\r\n1950: not leap year\r\n1951: not leap year\r\n1952: leap year\r\n1953: not leap year\r\n1954: not leap year\r\n1955: not leap year\r\n1956: leap year\r\n1957: not leap year\r\n1958: not leap year\r\n1959: not leap year\r\n1960: leap year\r\n1961: not leap year\r\n1962: not leap year\r\n1963: not leap year\r\n1964: leap year\r\n1965: not leap year\r\n1966: not leap year\r\n1967: not leap year\r\n1968: leap year\r\n1969: not leap year\r\n1970: not leap year\r\n1971: not leap year\r\n1972: leap year\r\n1973: not leap year\r\n1974: not leap year\r\n1975: not leap year\r\n1976: leap year\r\n1977: not leap year\r\n1978: not leap year\r\n1979: not leap year\r\n1980: leap year\r\n1981: not leap year\r\n1982: not leap year\r\n1983: not leap year\r\n1984: leap year\r\n1985: not leap year\r\n1986: not leap year\r\n1987: not leap year\r\n1988: leap year\r\n1989: not leap year\r\n1990: not leap year\r\n1991: not leap year\r\n1992: leap year\r\n1993: not leap year\r\n1994: not leap year\r\n1995: not leap year\r\n1996: leap year\r\n1997: not leap year\r\n1998: not leap year\r\n1999: not leap year\r\n2000: leap year\r\n2001: not leap year\r\n";

    @Test
    void leapYearsFrom1899To2001() {
        ByteArrayOutputStream fakeStdOut = new ByteArrayOutputStream();
        System.setOut(new PrintStream(fakeStdOut));
        LeapYear.print(1899, 2001);
        assertEquals(LEAP_YEARS_FROM_1899_TO_2001, fakeStdOut.toString());
    }
}
