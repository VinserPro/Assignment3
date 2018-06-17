package exercise1;

import javax.swing.JOptionPane;

public class UseInsurance
{
    public static void main(String[] args)
    {
        String userInput;
        int selection;

        userInput = JOptionPane.showInputDialog(null, "Show info for which insurance type?\n 1 - Life \n 2 - Health");
        selection = Integer.parseInt(userInput);

        if(selection == 1)
        {
            Life lifeInsurance = new Life();
            lifeInsurance.display();
        }
        else
        {
            Health healthInsurance = new Health();
            healthInsurance.display();
        }


    }
}