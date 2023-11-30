package java_seminar_1;
// Записать в файл следующие данные:

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// Name Surname Age
// Kate Smith 20
// Paul Green 25
// Mike Black 23
public class task6 {
    public static void main(String[] args) {
        File file = new File("task6.txt");
        try (FileWriter fw = new FileWriter(file)) {
             String data = "Name Surname Age\nKate Smith 20\nPaul Green 25\nMike Black 23";
             fw.write(data);
             fw.flush();
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
