public class Main {
    public static void main(String[] args) {
        //Дано слово, состоящее только из строчных латинских букв.
        // Проверьте, является ли это слово палиндромом. Выведите YES или NO.
        //При решении этой задачи нельзя пользоваться циклами,
        // в решениях на питоне нельзя использовать срезы с шагом, отличным от 1.
        String word = "jakjkaj";
        ifpalindrom(word);
    }
    public static void ifpalindrom(String word) {
        if (word.length() == 0 || word.length() == 1) {
            System.out.println("YES");
            return;
        } else {
            if (word.charAt(0)!=word.charAt(word.length()-1)) {
                System.out.println("NO");
                return;
            } else {
                ifpalindrom(word.substring(1,word.length()-1));
            }
        }
    }
}
