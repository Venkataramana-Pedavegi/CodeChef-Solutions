import java.util.*;
import java.text.*;

class Codechef
{
    public static Date validateDate(String deadline)
    {
        String errorMessage =
            "Invalid date format! Please enter the deadline in DD-MM-YYYY format.";

        if (deadline == null ||
            !deadline.matches("\\d{2}-\\d{2}-\\d{4}"))
        {
            System.out.println(errorMessage);
            return null;
        }

        SimpleDateFormat sdf =
            new SimpleDateFormat("dd-MM-yyyy");

        sdf.setLenient(false);

        try
        {
            return sdf.parse(deadline);
        }
        catch (ParseException e)
        {
            System.out.println(errorMessage);
            return null;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        String deadline = sc.nextLine();

        Date result = validateDate(deadline);
        if (result != null) {
            System.out.println("Valid date: " + deadline);
        }
    }
}