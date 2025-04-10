import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //Дана последовательность натуральных чисел (одно число в строке), завершающаяся числом 0.
        // Определите значение второго по величине элемента в этой последовательности,
        // то есть элемента, который будет наибольшим, если из последовательности удалить наибольший элемент.
        //В этой задаче нельзя использовать глобальные переменные. Функция получает данные,
        // считывая их с клавиатуры, а не получая их в виде параметра.
        // В программе на языке Python функция возвращает результат в виде кортежа из нескольких чисел и функция вообще не получает никаких параметров.
        // В программе на языке C++ результат записывается в переменные, которые передаются в функцию по ссылке.
        // Других параметров, кроме как используемых для возврата значения, функция не получает.
        //Гарантируется, что последовательность содержит хотя бы два числа (кроме нуля).
        secmax(0,0);
    }
    public static void secmax(int max1, int max2) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        if (n == 0) {
            System.out.println(max2);
        }
        else if (n > max1)  {
            secmax(n,max1);
        } else if (n > max2) {
            secmax(max1,n);
        } else {
            secmax(max1,max2);
        }
    }
}
