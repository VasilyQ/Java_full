package java_seminar_1;

import java.util.Scanner;

// Написать программу, которая попросит пользователя ввести <Имя> в консоли. 
// Получит введенную строку и напечатает в консоль сообщение “Привет, <Имя>!”
public class task2 {
    public static void main(String[] args) {
        System.out.println("Введите имя: ");
        Scanner sc = new Scanner(System.in, "cp866");
        String name = sc.next();
        System.out.println("Привет, "+ name);
        int a = 123;
        System.out.printf("Привет, %s %s ", name, a);
    }
}
