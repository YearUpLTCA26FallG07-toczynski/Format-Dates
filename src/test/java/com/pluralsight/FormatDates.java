
package com.pluralsight;

import java.time.LocalDateTime;
import java.time.ZonedDateTime;
import java.time.ZoneOffset;
import java.time.format.DateTimeFormatter;

public class FormatDates {

    public static void main(String[] args) {

        // Get the current date and time
        LocalDateTime now = LocalDateTime.now();

        // Format 1: MM/dd/yyyy
        DateTimeFormatter format1 =
                DateTimeFormatter.ofPattern("MM/dd/yyyy");
        System.out.println(now.format(format1));

        // Format 2: yyyy-MM-dd
        DateTimeFormatter format2 =
                DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(now.format(format2));

        // Format 3: Wednesday, April 22, 2026
        DateTimeFormatter format3 =
                DateTimeFormatter.ofPattern("EEEE, MMMM d, yyyy");
        System.out.println(now.format(format3));

        // Format 4: Display the date and time in GMT
        ZonedDateTime gmtTime =
                ZonedDateTime.now(ZoneOffset.UTC);

        DateTimeFormatter format4 =
                DateTimeFormatter.ofPattern("EEEE, MMM d, yyyy HH:mm");

        System.out.println(gmtTime.format(format4));

        // Challenge: Display the date and time in your local time zone
        DateTimeFormatter challengeFormat =
                DateTimeFormatter.ofPattern("h:mm 'on' dd-MMM-yyyy");

        System.out.println(now.format(challengeFormat));
    }
}
