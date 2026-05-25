package ru.bogae.geometry;

import ru.bogae.geometry.figures.Rectangle;
import ru.bogae.geometry.figures.Square;
import ru.bogae.geometry.figures.Triangle;

public class Geometry {
    public static void main(String[] args){
        Square.printSquareAria(3);// Вызываем функцию(printSquareAria) которая находится в классе(ru.bogae.geometry.figures.Square) с параметром а, который имеет значение 3
        Square.printSquareAria(5);
        Square.printSquareAria(7);

        Rectangle.printRectangleAria(3.0, 5.0);

        Triangle.printTriangleArea(5,6,7);
        Triangle.printTianglePerimeter(5,5,5);


    }

}
