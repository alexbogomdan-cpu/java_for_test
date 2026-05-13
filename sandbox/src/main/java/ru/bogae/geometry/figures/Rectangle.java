package ru.bogae.geometry.figures;

public class Rectangle {
    public static void printRectangleAria(double a, double b) {
        System.out.println("Площадь прямоугольника со сторонами" + a +" и "+b+ "=" + rectangleAria(a,b));
    }

    private static double rectangleAria(double a, double b) {
        return a*b;
    }
}
