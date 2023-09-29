package Strategy;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class PayByPayPal implements PayStrategy {
    private static final Map<String, String> DATA_BASE = new HashMap<>();
    private final BufferedReader READER = new BufferedReader(new InputStreamReader(System.in));
    private String email;
    private String password;
    private boolean isSignedIn;

    static {
        DATA_BASE.put("amanda1985", "amanda@ya.com");
        DATA_BASE.put("qwerty", "john@amazon.eu");
    }

    @Override
    public void collectPaymentDeatails() {
        try {
            while (!isSignedIn) {
                System.out.print("Enter the user's email: ");
                email = READER.readLine();
                System.out.print("Enter the password: ");
                password = READER.readLine();

                if (verify()) {
                    System.out.println("Data verification has been successful.");
                } else {
                    System.out.println("Wrong email or password!");
                }
            } 
        } catch (IOException ex) {
            ex.printStackTrace();
        }
    }

    private boolean verify() {
        setIsSignedIn(email.equals(DATA_BASE.get(password)));
        return isSignedIn;
    }

    @Override
    public boolean pay(int paymentAmount) {
        if (isSignedIn) {
            System.out.println("Paying " + paymentAmount + " using PayPal.");
            return true;
        } else {
            return false;
        }
    }

    private void setIsSignedIn(boolean signedIn) {
        this.isSignedIn = signedIn;
    }
}
