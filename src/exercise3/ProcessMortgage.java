package exercise3;

public class ProcessMortgage {
    public static void main(String[] args) {

        MortgageConstants mortgageConstants = new MortgageConstants(0001, "YourBank", 200.00, 3.0,1);

        BusinessMortgage businessMortgage = new BusinessMortgage(0002, "Business Mortgage", 100.00, 1.0, 4);

        PersonalMortgage personalMortgage = new PersonalMortgage(0003, "Personal Mortgage", 50.00, 2.0, 2);

        Mortgage[] mortgages = new Mortgage[3];

        mortgages[0] = mortgageConstants;
        mortgages[1] = businessMortgage;
        mortgages[2] = personalMortgage;

        System.out.println("Mortgages processed");
        for(Mortgage currentMortgage : mortgages) {
            System.out.println(currentMortgage);


            System.out.printf("info $%.2d%n%n", currentMortgage.info());
        }


    }
}
