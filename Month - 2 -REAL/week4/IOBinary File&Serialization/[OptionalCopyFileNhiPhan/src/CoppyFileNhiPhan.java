import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class CoppyFileNhiPhan {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter source file:");
        String source = scanner.nextLine();
        System.out.println("Enter target file:");
        String target = scanner.nextLine();
        try {
            File sourceFile = new File(source);
            File targetFile = new File(target);
            if (!sourceFile.exists()) {
                throw new FileNotFoundException("Chua co file goc");
            }
            if (targetFile.exists()) {
                throw new IOException("File da ton tai");
            }


            copyFileUsingStream(sourceFile, targetFile);
            System.out.println("Successfully");

        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        } catch (IOException e) {
            System.out.println(e.getMessage());

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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
            System.out.println(Arrays.toString(buffer));
        } finally {
            is.close();
            os.close();
        }
    }
}

