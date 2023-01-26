import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        byte[] info = new byte[12];
        System.out.println("Ввведите текст, для записи");
        System.in.read(info);
        char[] result = new char[12];

        for (int i = 0; i < info.length; i++) {
            result[i] = (char) info[i];
        }

        String resultString = new String(result);
        System.out.println("Вы ввели:" + resultString);
    }
}