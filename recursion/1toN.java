public class Main {
    public static void main(String[] args) {
        int N = 15;
        print(N);
        //Дано N, вывести все числа от 1 до N
    }
    public static void print(int n) {
         if (n==1) {
             System.out.println(1);
             return;//выход из рекурсии
         } else {
             System.out.println(n);
             print(n-1);
         }

    }
}
