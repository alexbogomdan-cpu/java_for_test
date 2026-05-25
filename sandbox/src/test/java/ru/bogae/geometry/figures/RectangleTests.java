package ru.bogae.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RectangleTests {

    @Test
    void canCalculateArea() {
        double result = Rectangle.rectangleAria(5,5);
        Assertions.assertEquals(25, result);

    }
}
