package home_work._2025_02_02;

import java.util.Scanner;

public class BiggestNumber {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            // Ввод трех чисел
            System.out.print("Введите три числа: ");
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();

            // Находим наибольшее число
            if (b > a) {
                a = b;
            }
            if (c > a) {
                a = c;
            }

            // Вывод результата
            System.out.println("Наибольшее число: " + a);
        }
    }


