import java.io.*;
import java.util.Scanner;

public class Sum {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhap file text de tinh tong :");
        String fileText = scanner.nextLine();
        Sum sum = new Sum();
        sum.tinhTongFileText(fileText);

    }

    public static void tinhTongFileText(String src) throws IOException {

        try {
            int sum = 0;
            File file = new File(src);
            if (!file.exists()) {
                throw new FileNotFoundException("Khong tim thay file...");
            }
            FileReader fileReader = new FileReader(file);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;

            while ((((line = bufferedReader.readLine()) != null))) {
                System.out.println(line);
                sum = sum + Integer.parseInt(line);
            }
            System.out.println("Sum is:" + sum);

        } catch (FileNotFoundException f) {
            System.out.println("!!" + f.getMessage());

        } catch (Exception e) {
            System.out.println("Erro");
        }
    }

}




