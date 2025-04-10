public class Main {
    public static void main(String[] args) {
        int N = 129;
        stepen2(N);
        //Дано натуральное число N. Выведите слово YES, если число N является точной степенью двойки, или слово NO в противном случае.
        //Операцией возведения в степень пользоваться нельзя!
    }
    public static void stepen2(double n) {
        if (n==1) {
            System.out.println("YES");
            return;
        } else if (n<1){
            System.out.println("NO");
            return;
        } else {
            stepen2(n / 2);
        }
    }
}
