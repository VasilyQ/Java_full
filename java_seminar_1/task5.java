package java_seminar_1;

import java.util.Arrays;

// Во фразе "Добро пожаловать на курс по Java" переставить слова в обратном порядке.
public class task5 {
    public static void main(String[] args) {
        String m = "Добро пожаловать на курс по Java";
        String[] array = m.split(" ");
        System.out.println(Arrays.toString(array));

        for(int i = array.length-1; i >= 0;i--){
            System.out.print(array[i]+" ");
        }
    }
}
