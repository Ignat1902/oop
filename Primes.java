public class Primes{
    public static void main(String[] args){
        for (int i = 2; i<=100;i++) { // Создаётся цикл от 2 до 100
            if (isPrime(i)==true) // Происходит проверка, является ли число простым, с помощью метода isPrime
                System.out.print(i+" "); // Вывод простого числа
        }
    }

    public static boolean isPrime(int n){ // Метод проверки, является ли число простым
        boolean k = true; // Описание переменной k. Если k = true, то число n является простым
        for (int i = 2; i< n;i++) { // Цикл от 2 до n
            if (n % i == 0) // Проверка, делится ли n нацело на какое-либо число от 2 до n-1.
                k = false; // При истинности условия k принимает значение false. Это значит, что число n НЕ является простым
        }
        return k; // Вывод результата
    }
}