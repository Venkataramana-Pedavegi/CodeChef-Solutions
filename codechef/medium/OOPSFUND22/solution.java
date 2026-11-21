
import java.util.*;

// Implement the following types:
// 1. DeliveryService
// 2. StandardDelivery
// 3. ExpressDelivery
interface DeliveryService {
    long Calculate_Cost();
    String Delivery_Status();
}

class StandardDelivery implements DeliveryService {
    private long distance;
    private long weight;

    public StandardDelivery(long distance, long weight) {
        this.distance = distance;
        this.weight = weight;
    }

    @Override
    public long Calculate_Cost() {
        return 5 * distance + 2 * weight;
    }

    @Override
    public String Delivery_Status() {
        if (distance <= 50 && weight <= 20) {
            return "Available";
        }
        return "Unavailable";
    }
}

class ExpressDelivery implements DeliveryService {
    private long distance;
    private long weight;

    public ExpressDelivery(long distance, long weight) {
        this.distance = distance;
        this.weight = weight;
    }

    @Override
    public long Calculate_Cost() {
        return 8 * distance + 4 * weight + 30;
    }

    @Override
    public String Delivery_Status() {
        if (distance <= 100 && weight <= 10) {
            return "Available";
        }
        return "Unavailable";
    }
}


public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();
        StringBuilder output = new StringBuilder();

        while (T-- > 0) {
            String type = sc.next();
            long distance = sc.nextLong();
            long weight = sc.nextLong();

            DeliveryService service;

            if (type.equals("STANDARD")) {
                service = new StandardDelivery(
                    distance, weight
                );
            } else {
                service = new ExpressDelivery(
                    distance, weight
                );
            }

            output.append(type)
                  .append(" Cost: ")
                  .append(service.Calculate_Cost())
                  .append(" Status: ")
                  .append(service.Delivery_Status())
                  .append('\n');
        }

        System.out.print(output);
        sc.close();
    }
}
