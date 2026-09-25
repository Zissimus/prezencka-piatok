package sk.upjs.ics;

import java.time.LocalDate;
import java.util.Set;

public record Attendance(
        LocalDate date,
        Subject subject,
        Set<User> attendees
) {
}
