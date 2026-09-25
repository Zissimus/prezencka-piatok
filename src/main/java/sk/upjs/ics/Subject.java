package sk.upjs.ics;

import java.util.LinkedList;
import java.util.Set;

public record Subject(
        String name,
        int schoolYear,
        Long id,
        Set<User> students
) {
}
