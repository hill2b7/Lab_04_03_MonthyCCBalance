public class Main {
    public static void main(String[] args)
    {
        double cardBalance = 5000.00;
        double interestRate = 0.17;
        double firstMonthInterest = 0.00;
        double secondMonthInterest = 0.00;
        double total =0.00;

        firstMonthInterest = cardBalance * interestRate;
        System.out.println("The interest accrued for the first month is " + firstMonthInterest);
        total = firstMonthInterest + cardBalance;
        System.out.println("The total after the first month is " + total);
        secondMonthInterest = total * interestRate;
        total = total + secondMonthInterest;
        System.out.println("The total after the second month is " + total);
    }
}