public class Main {
    public static void main(String[] args) {
        //Дано натуральное число N. Вычислите сумму его цифр.
        //При решении этой задачи нельзя использовать строки, списки, массивы (ну и циклы, разумеется).
        int N = 2664533;
        System.out.println(summa(N));
    }
    public static int summa (int N) {
        if (N/10 == 0)
            return N;
        else {
            return N%10 + summa(N/10);
        }
    }
}
