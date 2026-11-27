import java.io.*;
import java.util.*;

public class Main {

    // 1. Mandatory Interface
    interface BonusPolicy {
        // 2. Static method
        static boolean isValidDepartment(String dept) {
            return "TECH".equals(dept) || "HR".equals(dept) || "SALES".equals(dept);
        }

        // 3. Abstract method
        double getBonusPercentage(String dept, int rating);

        // 4. Default method
        default double calculateFinalSalary(double salary, double bonusAmount) {
            return salary + bonusAmount;
        }
    }

    // Record or Class for Employee data
    static class Employee {
        String name, dept;
        double salary;
        int rating;

        Employee(String name, String dept, double salary, int rating) {
            this.name = name;
            this.dept = dept;
            this.salary = salary;
            this.rating = rating;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String firstLine = br.readLine();
        if (firstLine == null || firstLine.trim().isEmpty()) return;
        
        int n = Integer.parseInt(firstLine.trim());

        // 5. Store employees in a collection
        List<Employee> employees = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            String line = br.readLine();
            if (line == null) break;
            StringTokenizer st = new StringTokenizer(line);
            employees.add(new Employee(st.nextToken(), st.nextToken(), 
                          Double.parseDouble(st.nextToken()), Integer.parseInt(st.nextToken())));
        }

        // Concrete implementation of BonusPolicy using standard rules
        BonusPolicy policy = (dept, rating) -> {
            switch (dept) {
                case "TECH":
                    return rating < 3 ? 5.0 : (rating <= 4 ? 10.0 : 15.0);
                case "HR":
                    return rating < 3 ? 3.0 : (rating <= 4 ? 7.0 : 10.0);
                case "SALES":
                    return rating < 3 ? 8.0 : (rating <= 4 ? 12.0 : 20.0);
                default:
                    return 0.0;
            }
        };

        StringBuilder output = new StringBuilder();

        // 6. Process collection strictly using forEach()
        employees.forEach(emp -> {
            if (!BonusPolicy.isValidDepartment(emp.dept)) {
                output.append(emp.name).append(" INVALID\n");
            } else {
                double bonusPct = policy.getBonusPercentage(emp.dept, emp.rating);
                double bonusAmt = emp.salary * bonusPct / 100.0;
                double finalSalary = policy.calculateFinalSalary(emp.salary, bonusAmt);

                output.append(String.format(Locale.US, "%s %.2f %.2f %.2f\n", 
                        emp.name, bonusPct, bonusAmt, finalSalary));
            }
        });

        System.out.print(output);
    }
}