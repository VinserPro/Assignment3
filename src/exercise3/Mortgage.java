package exercise3;

public abstract class Mortgage {
    private final int number;
    private final String name;
    private final double mortgageAmount;
    private final double interestRate;
    private final int term;

    public Mortgage(int number, String name, double mortgageAmount,double interestRate, int term)
    {
        this.number = number;
        this.name = name;
        this.mortgageAmount = mortgageAmount;
        this.interestRate = interestRate;
        this.term = term;

        if ( mortgageAmount > 300.00)
        {
            throw new IllegalArgumentException("The mortgage amount has to be lower that $300");
        }

        if ( term < 1)
        {
            throw new IllegalArgumentException("The term is not defined");
        }

    }

    public int getNumber() {
        return number;
    }

    public String getName() {
        return name;
    }

    public double getMortgageAmount() {
        return mortgageAmount;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public int getTerm() {
        return term;
    }


    @Override
    public String toString() {
        return String.format("%s %s%nMortgage: %s",
                getNumber(), getName(), getMortgageAmount(), getInterestRate(), getTerm());
    }

    // Declare an abstract earnings method
    public abstract double info();
}