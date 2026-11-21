import java.util.*;

// Implement the following types:
// 1. Student
// 2. UG_Students
// 3. PG_Students
interface Student {
    String Display_Grade();
    String Attendance();
}

class UG_Students implements Student {
    private int score;
    private int attendance;

    public UG_Students(int score, int attendance) {
        this.score = score;
        this.attendance = attendance;
    }

    @Override
    public String Display_Grade() {
        if (score >= 80) {
            return "A";
        } else if (score >= 60) {
            return "B";
        } else if (score >= 40) {
            return "C";
        } else {
            return "F";
        }
    }

    @Override
    public String Attendance() {
        return attendance >= 75 ? "Eligible" : "Not Eligible";
    }
}

class PG_Students implements Student {
    private int score;
    private int attendance;

    public PG_Students(int score, int attendance) {
        this.score = score;
        this.attendance = attendance;
    }

    @Override
    public String Display_Grade() {
        if (score >= 85) {
            return "A";
        } else if (score >= 70) {
            return "B";
        } else if (score >= 50) {
            return "C";
        } else {
            return "F";
        }
    }

    @Override
    public String Attendance() {
        return attendance >= 80 ? "Eligible" : "Not Eligible";
    }
}



public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        StringBuilder output = new StringBuilder();

        while (T-- > 0) {
            String type = sc.next();
            int score = sc.nextInt();
            int attendance = sc.nextInt();

            Student student;

            if (type.equals("UG")) {
                student = new UG_Students(
                    score, attendance
                );
            } else {
                student = new PG_Students(
                    score, attendance
                );
            }

            output.append(type)
                  .append(" Grade: ")
                  .append(student.Display_Grade())
                  .append(" Attendance: ")
                  .append(student.Attendance())
                  .append('\n');
        }

        System.out.print(output);
        sc.close();
    }
}
