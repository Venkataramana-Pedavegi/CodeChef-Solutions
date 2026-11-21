    }
}


// ================= MAIN =================
public class Codechef {

    public static void main(String[] args) {

        Order order = new Order("ORD101", "Laptop", 50000);

        PaymentMethod paymentMethod = new CreditCardPayment();

        NotificationSender notificationSender = new EmailNotification();

        DeliveryPartner deliveryPartner = new BikeDeliveryPartner();

        InvoiceGenerator invoiceGenerator = new InvoiceGenerator();

        OrderService service = new OrderService(invoiceGenerator);

        service.processOrder(order, paymentMethod, notificationSender, deliveryPartner);
    }
}