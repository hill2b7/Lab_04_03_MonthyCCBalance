public class Main {
    public static void main(String[] args)
    {
        double cardBalance = 5000.00; //sets card balance amount
        double interestRate = 0.17; // Fixed Interest Rate
        double firstMonthInterest = 0.00; //assigns first month to 0
        double secondMonthInterest = 0.00; // assigns second month to 0
        double total =0.00; //sets total to 0

        firstMonthInterest = cardBalance * interestRate; //calculates first month interest
        System.out.println("The interest accrued for the first month is " + firstMonthInterest); //system output
        total = firstMonthInterest + cardBalance; // calculates new total
        System.out.println("The total after the first month is " + total); //system output total
        secondMonthInterest = total * interestRate; // calculates second month interest
        System.out.println("The interest accrued for the second month is " + secondMonthInterest); //system output
        total = total + secondMonthInterest; // calculates total after 2 months
        System.out.println("The total after the second month is " + total); // output total after 2 months
    }
}