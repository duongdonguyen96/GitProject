package Entity.File_IO_Entity;

import Entity.Student.Student;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.HashMap;

public class FileIO {
    private static final String NEW_LINE = "\n";
    private static final String fileNameStudent = "src/Data/student.txt";
    private static final String FOOTTER = "+--------------+--------------+--------------+--------------+--------------+--------------+--------------+";
    private static final String INFORMATION = "|ID            |NAME          |Mark1         |Mark2         | Mark3        | Mark4        |AvrMark       |";
    private static final String CHARACTER = "|";
    private static final String SPACE = " ";
    private static final String HEADER_CHARACTER =

            "+--------------+--------------+--------------+--------------+--------------+--------------+--------------+\n" +
                    "|ID            |NAME          |Mark1         |Mark2         | Mark3        | Mark4        |AvrMark       |\n" +
                    "+--------------+--------------+--------------+--------------+--------------+--------------+--------------+";

    public static void writeFile(HashMap<String, Student> studentHashMap) {
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(fileNameStudent);
            fileWriter.append(HEADER_CHARACTER);
            fileWriter.append(NEW_LINE);
            for (Student student : studentHashMap.values()) {

                fileWriter.append(CHARACTER);
                fileWriter.append(String.valueOf(student.getId()));
                for (int i = 0; i < 14 - String.valueOf(student.getId()).length(); i++) {
                    fileWriter.append(SPACE);
                }
                fileWriter.append(CHARACTER);
                fileWriter.append(student.getName());
                for (int i = 0; i < 14 - student.getName().length(); i++) {
                    fileWriter.append(SPACE);
                }
                fileWriter.append(CHARACTER);
                fileWriter.append(String.valueOf(student.getMark1()));
                for (int i = 0; i < 14 - String.valueOf(student.getMark1()).length(); i++) {
                    fileWriter.append(SPACE);
                }
                fileWriter.append(CHARACTER);
                fileWriter.append(String.valueOf(student.getMark2()));
                for (int i = 0; i < 14 - String.valueOf(student.getMark2()).length(); i++) {
                    fileWriter.append(SPACE);
                }
                fileWriter.append(CHARACTER);
                fileWriter.append(String.valueOf(student.getMark3()));
                for (int i = 0; i < 14 - String.valueOf(student.getMark3()).length(); i++) {
                    fileWriter.append(SPACE);
                }
                fileWriter.append(CHARACTER);
                fileWriter.append(String.valueOf(student.getMark4()));
                for (int i = 0; i < 14 - String.valueOf(student.getMark4()).length(); i++) {
                    fileWriter.append(SPACE);
                }
                fileWriter.append(CHARACTER);
                fileWriter.append(String.valueOf(student.getAvgMarks()));
                for (int i = 0; i < 14 - String.valueOf(student.getAvgMarks()).length(); i++) {
                    fileWriter.append(SPACE);
                }
                fileWriter.append(CHARACTER);
                fileWriter.append(NEW_LINE);
            }
            fileWriter.append(FOOTTER);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                fileWriter.flush();
                fileWriter.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }

    }


    public static HashMap<String, Student> readFile() {
        BufferedReader br = null;
        HashMap<String, Student> studentHashMap = new HashMap<>();
        Path path = Paths.get(fileNameStudent);
        if (!Files.exists(path)) {
            try {
                FileWriter fileWriter = new FileWriter(fileNameStudent);

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        try {
            String line;
            br = new BufferedReader(new FileReader(fileNameStudent));
            while ((line = br.readLine()) != null) {
                if (line.equals(FOOTTER)) continue;
                if (line.equals(INFORMATION)) continue;
                String[] splitData = line.split("\\|");

                Student student = new Student();
                student.setId((splitData[1].trim()));
                student.setName(splitData[2].trim());
                student.setMark1(Float.parseFloat(splitData[3].trim()));
                student.setMark2(Float.parseFloat(splitData[4].trim()));
                student.setMark3(Float.parseFloat(splitData[5].trim()));
                student.setMark4(Float.parseFloat(splitData[6].trim()));
                student.setAvgMarks();
                studentHashMap.put(student.getId(), student);

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
        return studentHashMap;
    }

}


