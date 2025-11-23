import java.util.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StudentManager manager = new StudentManager();

        // Load old data
        Database.loadFromFile(manager.getStudentList());

        int choice;

        do {
            System.out.println("\n===== Student Management System =====");
            System.out.println("1. Add Student");
            System.out.println("2. Remove Student");
            System.out.println("3. Update Student");
            System.out.println("4. Search Student");
            System.out.println("5. Display All Students");
            System.out.println("6. Save & Exit");
            System.out.print("Enter choice: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter ID: ");
                    int id = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();
                    System.out.print("Enter Age: ");
                    int age = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Grade: ");
                    String grade = sc.nextLine();

                    manager.addStudent(new Student(id, name, age, grade));
                    break;

                case 2:
                    System.out.print("Enter ID to remove: ");
                    manager.removeStudent(sc.nextInt());
                    break;

                case 3:
                    System.out.print("Enter ID to update: ");
                    int uid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Name: ");
                    String n = sc.nextLine();
                    System.out.print("Enter new Age: ");
                    int a = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter new Grade: ");
                    String g = sc.nextLine();
                    manager.updateStudent(uid, n, a, g);
                    break;

                case 4:
                    System.out.print("Enter ID to search: ");
                    Student s = manager.searchStudent(sc.nextInt());
                    if (s != null)
                        System.out.println("Found: " + s.getDetails());
                    else
                        System.out.println("Student not found!");
                    break;

                case 5:
                    manager.displayAll();
                    break;

                case 6:
                    Database.saveToFile(manager.getStudentList());
                    System.out.println("Exiting...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }

        } while (choice != 6);
    }
}
