package Common;

import Model.Product;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;


public class FuntionFileTxt {
    private static final String DELIMITER = ",";
    private static final String NEW_LINE = "\n";
    private static final String fileNameProduct = "src/Data/product.txt";
    private static final String HEADDER_PRODUCT = "id,name,producer,price,otherdescription";


    public static void writeProductToFileText(ArrayList<Product> productList) {
        FileWriter fileWriter = null;

        try {
            fileWriter = new FileWriter(fileNameProduct);
            fileWriter.append(HEADDER_PRODUCT);
            fileWriter.append(NEW_LINE);

            for (Product product : productList) {
                fileWriter.append(product.getId());
                fileWriter.append(DELIMITER);
                fileWriter.append(product.getName());
                fileWriter.append(DELIMITER);
                fileWriter.append(product.getProducer());
                fileWriter.append(DELIMITER);
                fileWriter.append(product.getPrice());
                fileWriter.append(DELIMITER);
                fileWriter.append(product.getOtherDescription());
                fileWriter.append(NEW_LINE);
            }


        } catch (Exception e) {
            System.out.println("Error when Computer write product to file text");
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (Exception e) {
                System.out.println(e.getMessage());

            }

        }


    }

    public static ArrayList<Product> sendFileToListStudent() {
        BufferedReader br = null;
        ArrayList<Product> productsList = new ArrayList<>();
        Path path = Paths.get(fileNameProduct);

        if (!Files.exists(path)) {
            try {
                FileWriter fileWriter = new FileWriter(fileNameProduct);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameProduct));
            while ((line = br.readLine()) != null) {
                String[] splitDate = line.split(",");
                if (splitDate[0].equals("id")) {
                    continue;
                }
                Product product = new Product();
                product.setId(splitDate[0]);
                product.setName(splitDate[1]);
                product.setProducer(splitDate[2]);
                product.setPrice(splitDate[3]);
                product.setOtherDescription(splitDate[4]);
                productsList.add(product);

            }

        } catch (Exception e) {
            System.out.println(e.getMessage());

        } finally {
            try {
                br.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return productsList;
    }

}
