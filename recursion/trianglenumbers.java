public class Main {
    public static void main(String[] args) {
        //Дана монотонная последовательность,
        //в которой каждое натуральное число k встречается ровно k раз: 1, 2, 2, 3, 3, 3, 4, 4, 4, 4,…
        //По данному натуральному n выведите первые n членов этой последовательности.
        //Попробуйте обойтись только одним циклом for.
        int n = 7;
        printn(n);
    }
    public static String printn(int n) {
        int sum = 0;
        int j = 0;
        // Базовый случай
        if (n == 1) {
            System.out.print("1");
        } else {
            for (int i = 1; sum < n; i++) {
                sum += i;
                j = i;
            }
            // Шаг рекурсии / рекурсивное условие
            System.out.print(printn(--n) + " " + j);
        }
        return "";
    }
}
