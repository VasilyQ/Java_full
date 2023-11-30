package java_seminar_1;

import java.time.LocalTime;
import java.util.Scanner;

// В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида 
// "Добрый день, <Имя>!", если время от 6:00 до 17:59;
// "Добрый вечер, <Имя>!", если время от 18:00 до 22:59;
public class task3 {
    public static void main(String[] args) {
        System.out.println("Введите имя: ");
        Scanner sc = new Scanner(System.in, "cp866");
        String name = sc.next();
        // System.currentTimeMillis();
        LocalTime time = LocalTime.now();
        if (time.isAfter(LocalTime.of(6,0)) && time.isBefore(LocalTime.of(18, 0))){
            System.out.println("Добрый день " + name);
        }
        else{
            System.out.println("Добрый вечер " + name);
        }

    }
}
