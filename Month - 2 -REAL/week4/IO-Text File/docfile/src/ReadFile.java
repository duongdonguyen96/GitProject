import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class ReadFile {
    public static void main(String[] args) throws IOException {
        File file = new File("csv.txt");
        if (!file.exists()) {
            file.createNewFile();
        }
        FileInputStream fileInputStream = new FileInputStream(file);
        int c = fileInputStream.read();
        while (c != -1) {
            System.out.print((char) c);
            c = fileInputStream.read();
        }
        fileInputStream.close();

    }

}

