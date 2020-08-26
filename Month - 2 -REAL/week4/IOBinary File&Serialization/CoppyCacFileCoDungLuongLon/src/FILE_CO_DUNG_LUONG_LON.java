import java.io.*;
import java.nio.file.Files;
import java.util.Scanner;

public class FILE_CO_DUNG_LUONG_LON {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter source file:");
        String source = scanner.nextLine();
        System.out.println("Enter target file:");
        String target = scanner.nextLine();

        File sourceFile = new File(source);
        File targetFile = new File(target);

        try {
            copyFileUsingJava7Files(sourceFile, targetFile);
//            copyFileUsingStream(sourceFile, targetFile);
            System.out.println("Successfully");

        } catch (IOException exception) {
            System.out.println("Error...!");

        }


    }

    private static void copyFileUsingJava7Files(File source, File target) throws IOException {
        Files.copy(source.toPath(), target.toPath());
    }

    private static void copyFileUsingStream(File source, File dest) throws IOException {
        InputStream is = null;
        OutputStream os = null;
        try {
            is = new FileInputStream(source);
            os = new FileOutputStream(dest);
            byte[] buffer = new byte[1024];
            int length;
            while ((length = is.read(buffer)) > 0) {
                os.write(buffer, 0, length);
            }
        } finally {
            is.close();
            os.close();
        }
    }
}
