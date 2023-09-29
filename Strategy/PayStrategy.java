package Strategy;

public interface PayStrategy {
    boolean pay(int paymentAmount);
    void collectPaymentDeatails();
}