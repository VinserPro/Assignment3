package exercise2;

import javax.swing.JOptionPane;

public class PartTimeStudent extends Student {

    private final double PART_TIME_STUDENT = 100;
    private final String status = "Part Time";
    int numberCreditHours;
    String userInput1;


    public PartTimeStudent()
    {
        super("John");
    }

    public void tuition()
    {
        userInput1 = JOptionPane.showInputDialog(null, "Write you credit number?");
        numberCreditHours = Integer.parseInt(userInput1);
        cost = PART_TIME_STUDENT;
        JOptionPane.showMessageDialog(null, "Student name: " + getName() + "\nStudent Status: " + status + "\nCost to pay: " + (getCost()*numberCreditHours));
    }

}