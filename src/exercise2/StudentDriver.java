package exercise2;

import javax.swing.JOptionPane;
import java.util.Scanner;

public class StudentDriver {
    public static void main(String[] args)
    {
        String userInput;
        int selection;
        int numberCreditHours;

        userInput = JOptionPane.showInputDialog(null, "Show the information about different type of students?\n 1 - FullTimeStudent \n 2 - PartTimeStudent");
        selection = Integer.parseInt(userInput);

        if (selection == 1)
        {
            FullTimeStudent FTS = new FullTimeStudent();
            FTS.tuition();
        }
        else
        {

            PartTimeStudent PTS = new PartTimeStudent();
            PTS.tuition();
        }

    }
}

