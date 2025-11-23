import java.util.*;

public class StudentManager {
    private List<Student> students = new ArrayList<>();

    public void addStudent(Student s) {
        students.add(s);
        System.out.println("Student added successfully!");
    }

    public void removeStudent(int id) {
        Student s = searchStudent(id);
        if (s != null) {
            students.remove(s);
            System.out.println("Student removed successfully!");
        } else {
            System.out.println("Student not found!");
        }
    }

    public void updateStudent(int id, String name, int age, String grade) {
        Student s = searchStudent(id);
        if (s != null) {
            s.setName(name);
            s.setAge(age);
            s.setGrade(grade);
            System.out.println("Details updated!");
        } else {
            System.out.println("Student not found!");
        }
    }

    public Student searchStudent(int id) {
        for (Student s : students) {
            if (s.getStudentId() == id)
                return s;
        }
        return null;
    }

    public void displayAll() {
        if (students.isEmpty()) {
            System.out.println("No students found!");
            return;
        }
        for (Student s : students) {
            System.out.println(s.getDetails());
        }
    }

    public List<Student> getStudentList() {
        return students;
    }
}
