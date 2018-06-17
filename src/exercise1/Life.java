package exercise1;

import javax.swing.JOptionPane;

public class Life extends Insurance
{
    // nobody likes "magic" numbers ;)
    private final double LIFE_INSURANCE_COST = 36;

    public Life()
    {
        super("Life");
        setCost();
    }

    public void setCost()
    {
        monthlyCost = LIFE_INSURANCE_COST;
    }

    public void display()
    {
        JOptionPane.showMessageDialog(null, "Insurance type: " + getInsuranceType() + "\nMonthly Cost: $" + getMonthlyCost());
    }
}