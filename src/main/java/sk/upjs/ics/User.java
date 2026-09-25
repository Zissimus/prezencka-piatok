package sk.upjs.ics;

import java.time.LocalDate;

public record User(
        Long id,
        String name,
        String username,
        Gender gender,
        LocalDate birthdate,
        Role role
) {
    public enum Role {
        STUDENT,
        TEACHER
    }

    public enum Gender{
        MALE,
        FEMALE,
        OTHER,
        UNKNOWN
    }

}
