package exercise3;

public class PersonalMortgage extends Mortgage {
    private double interestRate;

    public PersonalMortgage(int number, String name, double mortgageAmount,double interestRate, int term) {
        // Superclass
        super(number, name, mortgageAmount, interestRate, term);

        if(interestRate > 2.0) {
            throw new IllegalArgumentException("Wrong");
        }

        this.interestRate = interestRate;
    }

    public double getIneterstRate() {
        return interestRate;
    }

    public void setIneterstRate(double interestRate) {
        if(interestRate > 2.0) {
            throw new IllegalArgumentException("Wrong");
        }

        this.interestRate = interestRate;
    }

    @Override
    public double info() {
        return getIneterstRate();
    }

    @Override
    public String toString() {
        return String.format("Business Mortgage: %s%n%s: $%.2d",
                super.toString(), "Interest rate", getIneterstRate());
    }
}
