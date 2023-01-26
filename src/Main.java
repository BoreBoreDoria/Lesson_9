import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        try (FileWriter writer = new FileWriter("test.txt", true)) {
            String text = "Hello World!\nHello World!\nHello World!\nHello World!\nHello World!\n";
            writer.write(text);
            writer.flush();
            System.out.println("Файл успешно создан");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try (FileReader reader = new FileReader("test.txt")) { // Необходимо добавить полный путь до файла
            System.out.println("Чтение файла:");
            int c;

            while ((c = reader.read()) != -1) {
                System.out.print((char) c);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}