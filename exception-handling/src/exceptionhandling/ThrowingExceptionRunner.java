package exceptionhandling;

class Amount {
    private String currency;
    private int amount;

    public Amount(String currency, int amount) {
        super();
        this.currency = currency;
        this.amount = amount;
    }

    public void add(Amount that) throws Exception {

        if (!this.currency.equals(that.currency)) {
            throw new CurrenciesDoNotMatchException("Currencies do not match");
        }
        this.amount = this.amount + that.amount;
    }

    public String toString() {
        return amount + " " + currency;
    }
}

class CurrenciesDoNotMatchException extends Exception {
    CurrenciesDoNotMatchException(String message) {
        super(message);
    }
}

public class ThrowingExceptionRunner {
    public static void main(String[] args) throws Exception {
        Amount amount1 = new Amount("USD", 10);
        Amount amount2 = new Amount("EUR", 20);

        amount1.add(amount2);
        System.out.println(amount1);
    }
}
