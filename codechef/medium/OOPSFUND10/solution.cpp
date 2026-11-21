    public double calculateDiscount(double amount) {

// Provides a 10% discount to premium customers.
class PremiumDiscount implements DiscountPolicy {

    @Override
        return Math.round(amount * 100.0) / 100.0;
    }
}
        }
    }

    private double roundMoney(double amount) {
    private void validateAmount(double amount) {
        if (!Double.isFinite(amount) || amount < 0) {
            throw new IllegalArgumentException("Invalid purchase amount");
        return roundMoney(amount * 0.05);
    }

    public double calculateDiscount(double amount) {
        validateAmount(amount);

    @Override
// Provides a 5% discount to regular customers.
class RegularDiscount implements DiscountPolicy {

    double calculateDiscount(double amount);
}
interface DiscountPolicy {