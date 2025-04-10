public class Main {
    public static void main(String[] args) {
        //Дано натуральное число N. Выведите все его цифры по одной, в обратном порядке, разделяя их пробелами или новыми строками.
        //При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
        //Разрешена только рекурсия и целочисленная арифметика.
        int n = 123;
        print(n);
        //Дано натуральное число N. Выведите все его цифры по одной, в обычном порядке, разделяя их пробелами или новыми строками.
        //При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
        // Разрешена только рекурсия и целочисленная арифметика.
        System.out.println("===========");
        printreverse(n);
    }
    public static void print (int n) {
        if(n/10==0) {
            System.out.println(n);
            return;
        } else {
            System.out.println(n%10);
            print(n/10);
        }
    }
    public static void printreverse (int n) {
        if (n/10==0) {
            System.out.println(n);
            return;
        }
        else {
            printreverse(n/10);
            System.out.println(n%10);
        }
    }
}
