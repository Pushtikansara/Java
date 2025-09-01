package StudentManage;
import StudentManage.Details.StuDetails;
import StudentManage.Service.StuService;

public class Main {
    public static void main(String[] args) {
        StuService service = new StuService();

        StuDetails s1 = new StuDetails(1, "Pushti", 20, "CS", new int[]{85, 90, 78});
        StuDetails s2 = new StuDetails(2, "Aarya", 21, "Electronics", new int[]{60, 70, 55});
        StuDetails s3 = new StuDetails(3, "Riya", 19, "Maths", new int[]{95, 92, 88});

        service.registerStudent(s1);
        service.registerStudent(s2);
        service.registerStudent(s3);

        service.listStudents();
        service.searchById(2);
        service.searchById(5);
    }
}
