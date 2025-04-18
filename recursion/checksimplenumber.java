public class Main {
    public static void main(String[] args) {
        //Дано натуральное число n>1. Проверьте, является ли оно простым.
        // Программа должна вывести слово YES, если число простое и NO, если число составное. Алгоритм должен иметь сложность O(logn).
        //Указание. Понятно, что задача сама по себе нерекурсивна,
        // т.к. проверка числа n на простоту никак не сводится к проверке на простоту меньших чисел.
        // Поэтому нужно сделать еще один параметр рекурсии: делитель числа, и именно по этому параметру и делать рекурсию.
        int n = 4;
        simplecheck (n,2);
    }
    public static void simplecheck (int n,int k) {
        if (n==2) {
            System.out.println("YES");
            return;
        }
        if (n%k == 0) {
            System.out.println("NO");
            return;
        }
        if (k<n/2) {
            simplecheck(n, k + 1);
        } else {
            System.out.println("YES");
        }
    }
}
