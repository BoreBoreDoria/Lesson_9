import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){

        try (TestStream testStream = new TestStream()) { //Открыли ресурс
            System.out.println("Выполняем запись данных"); // Поработали с ресурсом
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // После чего автоматически его закрыли
    }
}