import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String out = "Enter the next\n"; // Данная реализацяи работает только на цифрах,
        // сиволах и англиских буквах

        try (OutputStream printStream = System.out) { // try with resources .
            // Данная конструкция позволяет нам создавать ресурс, пользоваться им.
            // А закрытие произойдёт автоматически.
            // Ресурсом может быть любой класс, который унаследовал интерфейс Closeable
            // Под капотом создаётся блок finally, где вызывается метод close()

            write(out, printStream);

            byte[] info = new byte[12];
            System.in.read(info);

            write("You entered: ", printStream);

            for (int i = 0; i < info.length; i++) {
                System.out.write(info[i]);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        OutputStream printStream = System.out;
        try {
            write(out, printStream);

            byte[] info = new byte[12];
            System.in.read(info);

            write("You entered: ", printStream);

            for (int i = 0; i < info.length; i++) {
                System.out.write(info[i]);
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        } finally {
            printStream.close();
        }
    }

    private static void write(String out, OutputStream printStream) throws IOException {
        char[] mas = out.toCharArray();

        for (int i = 0; i < out.length(); i++) {
            int a = mas[i];
            printStream.write(a);
        }
        printStream.flush();
    }
}