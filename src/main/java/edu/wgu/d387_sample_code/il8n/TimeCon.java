package edu.wgu.d387_sample_code.il8n;



import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;



public class TimeCon {
    public static String getTimeCon() {
        ZonedDateTime time = ZonedDateTime.now();

        ZonedDateTime Eastern = time.withZoneSameInstant(ZoneId.of("America/New_York"));
        ZonedDateTime Mountain = time.withZoneSameInstant(ZoneId.of("America/Denver"));
        ZonedDateTime UTC = time.withZoneSameInstant(ZoneId.of("UTC"));

        String timePattern = "hh:mm a";
        DateTimeFormatter timePatternFormatter = DateTimeFormatter.ofPattern(timePattern);

        return Eastern.format(timePatternFormatter)  + " ET | " + Mountain.format(timePatternFormatter)  + " MT | " + UTC.format(timePatternFormatter)  + " UTC";



    }
}
