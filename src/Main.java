import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        String out = "Enter the next\n"; // Данная реализацяи работает только на цифрах,
        // сиволах и англиских буквах
        OutputStream printStream = System.out;

        write(out, printStream);

        byte[] info = new byte[12];
        System.in.read(info);

        write("You entered: ", printStream);

        for (int i = 0; i < info.length; i++) {
            System.out.write(info[i]);
        }
        printStream.close();
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