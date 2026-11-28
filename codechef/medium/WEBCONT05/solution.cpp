        out.println("<html>");
        out.println("<head>");
        out.println("<title>Student Result</title>");
        out.println("</head>");
        out.println("<body>");

        out.println("<h2>Student Result</h2>");

        out.println("<p>Student Name: "
                + studentName + "</p>");

        out.println("<p>Total Marks: "
                + total + "</p>");

        out.println("<p>Average Marks: "
                + String.format("%.2f", average)
                + "</p>");

        out.println("<p>Grade: "
                + grade + "</p>");

        out.println("</body>");
        out.println("</html>");
    }
}