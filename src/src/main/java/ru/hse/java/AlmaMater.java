package ru.hse.java;

import java.time.ZonedDateTime;

/**
 * Реализовать методы
 * 1 - проверка на окончание школы
 * */
public interface AlmaMater {
    ZonedDateTime getDateOfGraduation();

    default boolean hasGraduated() {
        ZonedDateTime currentDate = ZonedDateTime.now();
        ZonedDateTime graduationDate = getDateOfGraduation();
        return graduationDate.isBefore(currentDate);
    }
}
