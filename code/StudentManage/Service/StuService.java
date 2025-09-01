package StudentManage.Service;

import StudentManage.Details.StuDetails;
import StudentManage.Utility.StuUtility;
import java.util.ArrayList;

public class StuService {
    private ArrayList<StuDetails> studentList = new ArrayList<>();

    
    public void registerStudent(StuDetails student) {
        studentList.add(student);
        System.out.println("Student registered: " + student.getName());
    }


    public void listStudents() {
        System.out.println("\n--- Student List ---");
        for (StuDetails s : studentList) {
            s.displayStudentInfo();
            String grade = StuUtility.calculateGrade(s.getMarks());
            System.out.println("Grade: " + grade);
            System.out.println("---------------------");
        }
    }

    public void searchById(int id) {
        for (StuDetails s : studentList) {
            if (s.getId() == id) {
                System.out.println("\n--- Student Found ---");
                s.displayStudentInfo();
                String grade = StuUtility.calculateGrade(s.getMarks());
                System.out.println("Grade: " + grade);
                return;
            }
        }
        System.out.println(" Student with ID " + id + " not found.");
    }
}
