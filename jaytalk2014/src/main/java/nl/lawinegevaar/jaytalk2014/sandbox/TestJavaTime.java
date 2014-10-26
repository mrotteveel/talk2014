/*
 * Copyright 2014 Mark Rotteveel (@avalanche1979)
 *
 * Examples licensed under Creative Commons Attribution-ShareAlike 4.0 International
 *
 * See http://creativecommons.org/licenses/by-sa/4.0/ for details
 */
package nl.lawinegevaar.jaytalk2014.sandbox;

import java.time.*;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalUnit;

/**
 * @author <a href="mailto:mrotteveel@users.sourceforge.net">Mark Rotteveel</a>
 */
public class TestJavaTime {

    public static void main(String[] args) {

        // Creation
        LocalDateTime localDateTime = LocalDateTime.of(2014, 10, 25, 11, 0);

        // calculation
        LocalDateTime localDateTime2 = localDateTime.plusMinutes(45);

        // Duration (time)
        Duration duration = Duration.between(localDateTime, localDateTime2);

        // Conversion
        LocalDate localDate = localDateTime.toLocalDate();
        LocalTime localTime = localDateTime2.toLocalTime();
        ZonedDateTime zonedDateTime = localDateTime.atZone(ZoneId.of("Europe/Prague"));
        OffsetDateTime offsetDateTime = localDateTime.atOffset(ZoneOffset.UTC);
        OffsetDateTime offsetDateTime2 = zonedDateTime.toOffsetDateTime();

        // JDBC relevant conversions
        java.sql.Timestamp sqlTimestamp = java.sql.Timestamp.valueOf(localDateTime2);
        LocalDateTime fromSqlTimestamp = sqlTimestamp.toLocalDateTime();
        java.sql.Time sqlTime = java.sql.Time.valueOf(LocalTime.now());
        java.sql.Date sqlDate = java.sql.Date.valueOf(LocalDate.now().plus(5, ChronoUnit.WEEKS));

        // Much, much more

    }
}
