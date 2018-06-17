package exercise2;

import javax.swing.JOptionPane;

public class FullTimeStudent extends Student {

    private final double FULL_TIME_FEE = 2000;
    private final String status = "Full Time";

    public FullTimeStudent()
    {
        super("Artem");
    }

    public void tuition()
    {
        cost = FULL_TIME_FEE;
        JOptionPane.showMessageDialog(null, "Student name: " + getName() + "\nStudent Status: " + status + "\nCost to pay: " + getCost());
    }

}