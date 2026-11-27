import java.util.Scanner;

public class Main
{
    @FunctionalInterface
    interface DiscountRule
    {
        int getDiscount(long price);

        default long calculateDiscountedPrice(long price) {
            int discount = getDiscount(price);
            return (price * (100 - discount)) / 100;
        }
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        if (!sc.hasNext())
        {
            return;
        }

        String membership = sc.next();

        boolean isPremium =
            membership.equals("PREMIUM");

        int n = sc.nextInt();

        long subtotal = 0;

        for (int i = 0; i < n; i++)
        {
            String type = sc.next();
            long price = sc.nextLong();

            DiscountRule rule;
            switch (type) {
                case "REGULAR":
                    rule = p -> isPremium ? 5 : 0;
                    break;
                case "SEASONAL":
                    rule = p -> isPremium ? 15 : 10;
                    break;
                case "CLEARANCE":
                    rule = p -> 25;
                    break;
                default:
                    rule = p -> 0;
                    break;
            }
            subtotal += rule.calculateDiscountedPrice(price);
        }

        long finalAmount = subtotal;
        if (subtotal >= 10000) {
            finalAmount = (subtotal * 95) / 100;
        }

        System.out.println(finalAmount);

        sc.close();
    }
}