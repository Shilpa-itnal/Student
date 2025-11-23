# Student
A simple Student Management System built using Core Java. Supports adding, updating, deleting, searching, and displaying student records. Uses ArrayList and file handling to store data. Perfect for beginners and Java mini-projects.

Features
✔ Add new student
✔ Remove student by ID
✔ Update student details
✔ Search student using ID
✔ Display all students
✔ Save student data to a file
✔ Load data automatically on startup
✔ Menu-driven console interface

Technologies Used
Core Java (OOP concepts)
Collections Framework (ArrayList)
File Handling (I/O Streams)
Scanner for input

StudentManagementSystem/
│
├── src/
│   ├── Student.java
│   ├── StudentManager.java
│   ├── Database.java
│   └── Main.java
│
├── students.txt
└── README.md

How It Works
1️⃣ On Startup

The system loads existing data from students.java.

2️⃣ User Menu
1. Add Student
2. Remove Student
3. Update Student
4. Search Student
5. Display All Students
6. Save & Exit

3️⃣ On Exit

All student data is saved back to the file.

How to Run the Project
Option 1: Using Command Line
javac *.java
java Main

Option 2: Using IDE

✔ Import the project into Eclipse, IntelliJ, or VS Code
✔ Run Main.java

Core Classes
1. Student.java

Represents a student with ID, name, age, and grade.

2. StudentManager.java

Handles operations like add, remove, search, display.

3. Database.java

Responsible for saving/loading student data from file.

4. Main.java

Contains the menu-driven console interface.
