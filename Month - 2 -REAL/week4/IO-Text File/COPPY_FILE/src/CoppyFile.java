import java.io.*;

public class CoppyFile {
    public static void main(String[] args) {
        int count = 0;
        File src = new File("src.txt");
        File target = new File("target.txt");
        if (!src.exists()) {
            System.out.println("File goc chua co");
        }
        if (target.exists()) {
            System.out.println("file target da ton tai");
        } else {
            try {
                target.createNewFile();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        try {
            FileReader fileReader = new FileReader(src);
            FileWriter fileWriter = new FileWriter(target);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = null;
            while ((line = bufferedReader.readLine()) != null) {
                fileWriter.write(line);
                count += line.length();
            }
            System.out.println(count);
            fileReader.close();
            fileWriter.close();


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println("Error....!");
        }
    }
}
