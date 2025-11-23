import java.io.*;
import java.util.*;

public class Database {

    private static final String FILE_NAME = "students.txt";

    public static void saveToFile(List<Student> students) {
        try {
            FileWriter fw = new FileWriter(FILE_NAME);
            for (Student s : students) {
                fw.write(s.getDetails() + "\n");
            }
            fw.close();
            System.out.println("Data saved to file.");
        } catch (Exception e) {
            System.out.println("Error saving file: " + e.getMessage());
        }
    }

    public static void loadFromFile(List<Student> students) {
        try {
            File file = new File(FILE_NAME);
            if (!file.exists()) return;

            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(" \\| ");
                int id = Integer.parseInt(data[0]);
                String name = data[1];
                int age = Integer.parseInt(data[2]);
                String grade = data[3];

                students.add(new Student(id, name, age, grade));
            }
            br.close();
            System.out.println("Data loaded from file.");
        } catch (Exception e) {
            System.out.println("Error loading file: " + e.getMessage());
        }
    }
}
