package ru.bogae.geometry.figures;

public class Rectangle {
    public static void printRectangleAria(double a, double b) {
        var text = String.format("Площадь прямоугольника со стороной %f  и %f  = %f", a, b,  rectangleAria(a,b));
        System.out.println(text);
    }

    public static double rectangleAria(double a, double b) {
        return a*b;
    }
}
