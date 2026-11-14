public class UpiPayment extends Payment {
    private final String upiId;

    public UpiPayment(double amount, String upiId) {
        super(amount);

        if (upiId == null || upiId.trim().isEmpty()) {
            throw new IllegalArgumentException("Invalid UPI ID");
        }

        this.upiId = upiId;
    }

    public String getUpiId() {
        return upiId;
    }

    @Override
    public void processPayment() {
        System.out.println("UPI payment of " + getAmount() + " processed for " + upiId);
    }
}


