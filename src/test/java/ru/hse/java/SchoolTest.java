package ru.hse.java;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import java.time.ZonedDateTime;

public class SchoolTest {

    @Test
    public void testNameIsValid() {
        String name = "И";
        Assertions.assertTrue(School.nameIsValid(name));
    }

    @Test
    public void testNameIsInvalid() {
        String name = "I";
        Assertions.assertFalse(School.nameIsValid(name));
    }

    @Test
    public void testStudentNameIsInvalid() {
        String name = "Ivan Ivanov";
        Assertions.assertFalse(Student.nameIsValid(name));
    }

    @Test
    public void testDateOfGraduationBeforeNow() {
        ZonedDateTime dateOfGraduation = ZonedDateTime.now().minusDays(1);
        AlmaMater university = new Student(dateOfGraduation);
        Assertions.assertTrue(university.getDateOfGraduation().isBefore(ZonedDateTime.now()));
    }
}
