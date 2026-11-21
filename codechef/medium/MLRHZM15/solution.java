import java.util.*;
import java.lang.*;
import java.io.*;

class InvalidProductIDException extends Exception
{
    InvalidProductIDException(String message)
    {
        super(message);
    }
}

class ProductValidation
{
    void validateProductID(String productID) throws InvalidProductIDException
    {
        if (!productID.matches("[A-Z]{3}[0-9]{5}"))
        {
            throw new InvalidProductIDException("Invalid Product ID");
        }
    }
}



class Codechef
{
    public static void main(String[] args) throws java.lang.Exception
    {
        Scanner sc = new Scanner(System.in);

        String productID = sc.next();

        ProductValidation validator = new ProductValidation();

        try
        {
            validator.validateProductID(productID);
            System.out.println("Valid Product ID");
        }
        catch (InvalidProductIDException e)
        {
            System.out.println(e.getMessage());
        }
    }
}