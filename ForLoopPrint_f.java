package MasterUdemy;

public class ForLoopPrint_f {

    public static void main(String[] args) {
        for(int i=8; i>=2; i--) {
            System.out.println("10,000 at " + i + "% interest = " + 
            			String.format("%.2f",calculateInterest(10000.0, i)));
        }
        System.out.println("------------------------------------");
        for(int i=2; i<9; i++) {
            System.out.println("10,000 at " + i + "% interest = " + 
            			String.format("%.2f",calculateInterest(10000.0, i)));
        }
    }
//-----------------------------------------------------------------
    public static double calculateInterest(double amount, double interestRate) {
        return(amount *(interestRate/100));
    }
}
/*
10,000 at 8% interest = 800.00
10,000 at 7% interest = 700.00
10,000 at 6% interest = 600.00
10,000 at 5% interest = 500.00
10,000 at 4% interest = 400.00
10,000 at 3% interest = 300.00
10,000 at 2% interest = 200.00
------------------------------------
10,000 at 2% interest = 200.00
10,000 at 3% interest = 300.00
10,000 at 4% interest = 400.00
10,000 at 5% interest = 500.00
10,000 at 6% interest = 600.00
10,000 at 7% interest = 700.00
10,000 at 8% interest = 800.00
*/