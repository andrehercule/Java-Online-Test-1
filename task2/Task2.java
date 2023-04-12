package task2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Ваш ход конем");
            String str1 = sc.nextLine();
            if (str1.equals("b1") || str1.equals("g1")) {
                System.out.println("Конь на этой клетке.Сделайте ход");
                String str2 = sc.nextLine();
                if (str2.equals("a3") || str2.equals("c3")) {
                    System.out.println("Отличный ход левым конем");
                } else if (str2.equals("h3") || str2.equals("f3")) {
                    System.out.println("Отличный ход правым конем");
                }
            } else System.out.println("Так конь не ходит!");
        }
    }
}



