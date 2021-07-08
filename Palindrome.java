public class Palindrome{
    public static void main(String[] args) {
        for (int i = 0; i < args.length; i++) { // Цикл от 0 до кол-ва введенных слов
            String s = args[i]; // В s записывается слово с индексом i
            if (isPalindrome(s)==true) // Проверка, является ли слово палиндромом с помощью метода isPalindrome
                System.out.println("The word " + s + " is a palindrome");
            else
                System.out.println("The word " + s + " is NOT a palindrome");
        }
    }

    public static String reverseString(String s){ // Метод, который отвечает за разворот строки
        String reverseS = new String()  ; // Создаётся новая переменная типа String для записи в неё развернутой стркои
        for (int i = s.length()-1;i>=0;i--){ // Цикл от длины слова s до 0
            reverseS += s.charAt(i); // C конца строки s в строку reverseS добавляются символы. Тем самым мы получаем развернутую строку s.
        }
        return reverseS; // Вывод развернутой строки s
    }

    public static  boolean isPalindrome(String s){ // Метод проверки на строки на палиндром
        return s.equals(reverseString(s)); // Сравнивается строка s со своим развернутым вариантом с помощью функции reverseString
    }
}