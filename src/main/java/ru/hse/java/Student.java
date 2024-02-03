package ru.hse.java;

import java.time.ZonedDateTime;
import java.util.regex.Pattern;

/**
 * ФИО, валидация, тесты.
 * АльмаМатер студента - это средняя школа, из которой он выпустился
 * */
public class Student implements AlmaMater{
    private static final Pattern NAME_MASK = Pattern.compile("[А-Яа-я ]+");
    static boolean nameIsValid(String name) {
        return NAME_MASK.matcher(name).matches();
    }

    private String name;
    private ZonedDateTime dateOfGraduation;

    public Student(ZonedDateTime dateOfGraduation) {
        this.dateOfGraduation = dateOfGraduation;
    }

    @Override
    public ZonedDateTime getDateOfGraduation() {
        return dateOfGraduation;
    }
}