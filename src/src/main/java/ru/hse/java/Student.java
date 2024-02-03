package ru.hse.java;

import java.time.ZonedDateTime;

/**
 * ФИО, валидация, тесты.
 * АльмаМатер студента - это средняя школа, из которой он выпустился
 * */
public class Student implements AlmaMater{
    private static final Pattern NAME_MASK = Pattern.compile("[А-Яа-я ]+");
    static boolean nameIsValid(String name) {
        return NAME_MASK.matcher(name).matches();
    }

    private ZonedDateTime dateOfGraduation;
    private String name;

    @Override
    public ZonedDateTime getDateOfGraduation() {
        return dateOfGraduation;
    }
}