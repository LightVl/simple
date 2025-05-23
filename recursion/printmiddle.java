import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Дана последовательность натуральных чисел (одно число в строке),
        // завершающаяся числом 0. Определите среднее значение элементов этой последовательности (без учета последнего нуля).
        // В этой задаче нельзя использовать глобальные переменные.
        // Функция получает данные, считывая их с клавиатуры, а не получая их в виде параметра.
        // В программе на языке Python функция возвращает кортеж из пары чисел: число элементов в последовательности и их сумма.
        // В программе на языке C++ результат записывается в две переменные, которые передаются в функцию по ссылке.
        // Гарантируется, что последовательность содержит хотя бы одно число (кроме нуля).
        printmid(0,0);
    }
    public static void printmid(double summ, int count) {
        Scanner console = new Scanner(System.in);
        double m = console.nextInt();
        if (m==0) {
            System.out.println(summ/count);
        }
        else {
            printmid(summ+m,++count);
        }
    }
}
