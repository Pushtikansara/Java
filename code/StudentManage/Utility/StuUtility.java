package StudentManage.Utility;

public class StuUtility {
    public static String calculateGrade(int[] marks) {
        int total = 0;
        for (int m : marks) {
            total += m;
        }
        double avg = (double) total / marks.length;

        if (avg >= 90) return "A+";
        else if (avg >= 75) return "A";
        else if (avg >= 60) return "B";
        else if (avg >= 40) return "C";
        else return "F";
    }
}
