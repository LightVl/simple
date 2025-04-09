public class Main {
    public static void main(String[] args) {
        //Даны два целых числа A и В (каждое в отдельной строке).
        //Выведите все числа от A до B включительно, в порядке возрастания, если A < B, или в порядке убывания в противном случае.
        int a = 10;
        int b = 5;
        print(a,b);
        System.out.println("======");
        a = 5;
        b = 15;
        print(a,b);
    }
    public static void print (int a, int b) {
        if (a<b) {
            if (a==b-1) {
                System.out.println(b);
                return;
            }
            System.out.println(a);
            print(a+1,b);
        } else {
            if (a==b+1) {
                System.out.println(a);
                return;
            }
            System.out.println(a);
            print(a-1,b);
        }
    }
}
