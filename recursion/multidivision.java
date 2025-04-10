public class Main {
    public static void main(String[] args) {
        // Дано натуральное число n>1.
        // Выведите все простые множители этого числа в порядке неубывания с учетом кратности.
        // Алгоритм должен иметь сложность O(logn).
        int n = 26;
        printmulti(n,2);
    }
    public static void printmulti(int n, int k) {
        if (k >= n/2) {
            System.out.println(n);
            return;
        }
        if (n%k == 0) {
            System.out.println(k);
            printmulti(n/k,k);
        } else {
            printmulti(n,k+1);
        }
    }
}
