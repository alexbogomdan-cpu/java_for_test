package ru.bogae.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SquareTests {

    @Test//анотация для запуска тестов
    void canCalculateArea(){
        double result = Square.squareaArea(5);
        Assertions.assertEquals(25, result);
    }
}
