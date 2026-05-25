package ru.bogae.geometry.figures;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class TriangleTests {
    @Test
    void canCalculateArea() {
        double result = Triangle.triangleArea(5,5,5);
        Assertions.assertEquals(10.825317547305483, result);


    }
    @Test
    void canCalculatePerimetr(){
        double result = Triangle.trianglePerimetr(5,5,5);
        Assertions.assertEquals(15,result);
    }
}
