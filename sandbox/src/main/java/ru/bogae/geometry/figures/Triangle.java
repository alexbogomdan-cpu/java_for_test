package ru.bogae.geometry.figures;

public record Triangle(double a, double b, double c) {
    public static void printTriangleArea(double a,double b,double c){
    String text = String.format("Площадь треугольника со сторонами %f, %f, %f  = %f", a, b, c, TriangleArea(a, b, c));
    System.out.println(text);
    }// его площадь можно вычислить по формуле: S = √(p ⋅ (p − a) ⋅ (p − b) ⋅ (p − c)), где a, b, c — длины сторон треугольника, p — полупериметр треугольника, равный половине суммы всех сторон: p = (a + b + c) / 2.


    private static double TriangleArea(double a, double b, double c) {
        var p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }

}
