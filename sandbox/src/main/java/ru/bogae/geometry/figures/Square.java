package ru.bogae.geometry.figures;

public class Square {
    public static void printSquareAria(double a){// функция printSquareAria ничего не возвращает(void)
        System.out.println("Площадь квадратата со стороной" + a + "=" + squareaArea(a));// с помощью контатенации
        String text = String.format("Площадь квадратата со стороной %f = %f", a, squareaArea(a));//variable
        System.out.println(text);// с помощью String.format
    }

    public static double squareaArea(double a) {

        return a * a;
    }
}
