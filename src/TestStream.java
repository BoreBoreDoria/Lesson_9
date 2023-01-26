import java.io.Closeable;
import java.io.IOException;

public class TestStream implements Closeable {
    public TestStream() throws IOException {
        connect();
    }

    public void connect() throws IOException{
        System.out.println("Соединение установлено");
    }

    @Override
    public void close() throws IOException {
        System.out.println("Ресурс закрылся");
    }
}
