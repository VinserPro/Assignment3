package exercise3;

public class MortgageConstants extends Mortgage {
    // Variables

    private int sTerm;
    private int mTerm;
    private int lTerm;
    private String bankName;
    private double mortgageAmount;



    // Constructor
    public MortgageConstants(int number, String name, double mortgageAmount, double interestRate, int term) {
        // explicit call to the Employee super class constructor
        super(number, name, mortgageAmount, interestRate, term);

        // Check if gross sales is 0.0 or higher
        if(sTerm > 1) {
            throw new IllegalArgumentException("Short Term from 1 to 365 days");
        }


        if(mTerm > 3) {
            throw new IllegalArgumentException("Medium Term should be up to 3 years");
        }

        if(lTerm > 5) {
            throw new IllegalArgumentException("Long Term should be up to 5 years");
        }


        this.sTerm = sTerm;
        this.mTerm = mTerm;
        this.lTerm = lTerm;

    }

    public int getsTerm() {
        return sTerm;
    }

    public void setsTerm(int sTerm) {
        if(sTerm > 1) {
            throw new IllegalArgumentException("Short Term from 1 to 365 days");
        }
        this.sTerm = sTerm;
    }




    public int getmTerm() {
        return mTerm;
    }

    public void setmTerm(int mTerm) {
        if(mTerm > 3) {
            throw new IllegalArgumentException("Medium Term should be up to 3 years");
        }
        this.mTerm = mTerm;
    }




    public int getlTerm() {
        return lTerm;
    }

    public void setlTerm(int lTerm) {
        if(lTerm > 5) {
            throw new IllegalArgumentException("Long Term should be up to 5 years");
        }
        this.lTerm = lTerm;
    }




    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public double getMortgageAmount() {
        return mortgageAmount;
    }

    public void setMortgageAmount(double mortgageAmount) {
        this.mortgageAmount = mortgageAmount;
    }



    @Override
    public double info() {
        return mortgageAmount;
    }

    @Override
    public String toString() {
        return String.format("%s: %s%n%s: %.2d; %s: %.2d; %s: %.2d; %s: %s%n%s: %.2d",
                "Mortgage Constraints", super.toString(),
                "Short Term", getsTerm(),
                "Medium Term", getmTerm(),
                "Long Term", getlTerm(),
                "Bank name", getBankName(),
                "Mortgage Amount", getMortgageAmount());
    }
}
