import java.io.*;
import java.util.*;

public class Main {

    static class Employee {
        String name;
        int score;
        int projects;

        Employee(String name, int score, int projects) {
            this.name = name;
            this.score = score;
            this.projects = projects;
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br =
                new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());
        int minimumScore = Integer.parseInt(st.nextToken());
        int minimumProjects = Integer.parseInt(st.nextToken());

        List<Employee> employees = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine());

            String name = st.nextToken();
            int score = Integer.parseInt(st.nextToken());
            int projects = Integer.parseInt(st.nextToken());

            employees.add(new Employee(name, score, projects));
        }

        // Safely remove ineligible employees using Iterator.
        Iterator<Employee> iterator = employees.iterator();

        while (iterator.hasNext()) {
            Employee employee = iterator.next();

            if (employee.score < minimumScore
                    || employee.projects < minimumProjects) {
                iterator.remove();
            }
        }

        // Custom sorting using Comparator.
        employees.sort((first, second) -> {
            // Higher score first.
            if (first.score != second.score) {
                return Integer.compare(second.score, first.score);
            }

            // More completed projects first.
            if (first.projects != second.projects) {
                return Integer.compare(
                        second.projects,
                        first.projects
                );
            }

            // Lexicographically smaller name first.
            return first.name.compareTo(second.name);
        });

        if (employees.isEmpty()) {
            System.out.println("NO EMPLOYEE");
            return;
        }

        StringBuilder output = new StringBuilder();

        for (Employee employee : employees) {
            output.append(employee.name)
                  .append(' ')
                  .append(employee.score)
                  .append(' ')
                  .append(employee.projects)
                  .append('\n');
        }

        System.out.print(output);
    }
}