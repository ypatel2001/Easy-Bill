// Author: Yash Patel

// Purpose: To create a program that utilizes math functions, operators, variables and constants.

import java.util.Scanner ;

public class TotalBillCalculator

{

     public static void main (String[ ] args)

     {
         double original_charge = 0;
         double tax_Rate = 0;
         double tip_Rate = 0;
         int people=0;
         Scanner input= new Scanner(System.in);
         
         System.out.println("This program will let you know how much your total bill is "
         + "including taxes, and the tip.");
         System.out.println("Please enter the amount of your original bill: ");
         original_charge= input.nextDouble();
         
         System.out.println("Please enter the percent of tax applied to your bill in decimal format: ");
         tax_Rate= input.nextDouble();
         
         System.out.println("Please enter the percent of tip applied to your bill in decimal format: ");
         tip_Rate= input.nextDouble();
         
         System.out.println("Please enter the number of people to split the bill with: ");
         people= input.nextInt();



         double tax_amount = original_charge * tax_Rate ;
         double tip_amount = (original_charge + tax_amount) * tip_Rate;
         double total_amount = original_charge + tax_amount + tip_amount;
         double individual_share = total_amount / people;
         
         System.out.println ("Hello, here is a breakdown of your bill.\n");
         System.out.println ("Your bill, before tax and gratuity, comes out to: $" + original_charge + ".\n");
         System.out.println ("The amount of tax applied to your bill is: $" + tax_amount + ".\n");
         System.out.println ("The gratuity applied to your bill (post-tax) is: $" + tip_amount + ".\n");
         System.out.println ("The grand total amount of your bill is: $" + total_amount + ".\n");
         System.out.println ("The grand total, divided amongst "+ people+" people, comes out to an individual share of $"+ individual_share + " per person.\n");
         System.out.println ("Thank you and have a good day!");


     }

}
         
