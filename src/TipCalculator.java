
//Imports
import java.util.Scanner; //For Scanners
import java.lang.Math; //For rounding

public class TipCalculator
{
    public static void main(String[]args)
    {
        Scanner scan = new Scanner(System.in);

        //Declaring and Initializing all the variables

        //all the input ones
        System.out.print("What is your bill? ");
        double totalBill = scan.nextDouble();

        System.out.print("What percent would you like to tip? ");
        int tip = scan.nextInt();

        System.out.print("How many people is paying? ");
        int people = scan.nextInt();

        //rest of them, Math.round = Rounding
        double totalBillPlusTip =  Math.round(((1 + tip/100.0) * totalBill) * 100.0) / 100.0;
        double totalTip = Math.round((totalBillPlusTip - totalBill) * 100.0) /100.0;
        double totalPerPerson = Math.round((totalBillPlusTip/people) * 100.0) / 100.0;
        double tipPerPerson = Math.round((totalTip/people) * 100.0) / 100.0;

        //Writing out the answers
        System.out.println("The total bill including Tip amount is $" + totalBillPlusTip);
        System.out.println("The total tip amount is $" + totalTip);
        System.out.println("The total bill including Tip per person is $" + totalPerPerson);
        System.out.println("The total tip per person is $" + tipPerPerson);

    }
}

