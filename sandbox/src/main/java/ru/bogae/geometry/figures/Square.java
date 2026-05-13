package ru.bogae.geometry;

public class Square {
    static void printSquareAria(double a){// функция printSquareAria ничего не возвращает(void)
        System.out.println("Площадь квадратата со стороной" + a + "=" + squareaArea(a));
    }

    private static double squareaArea(double a) {
        return a * a;
    }
}
