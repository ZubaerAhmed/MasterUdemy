package MasterUdemy;

public class PrimeNumber {

	public static void main(String[] args) {
		loopIsPrime();

	}
//==================================================
	public static void loopIsPrime() {
        //prime number from 10 - 50
        int count = 0;
        for(int i=0; i<50; i++) {
            if(isPrime(i)) {
                count++;
                System.out.println( i + "\tis a prime number");
                if(count == 10) {
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
	}
//----------------------------------------------------------------
    public static boolean isPrime(int n) {
        if(n <= 1) {
            return false;
        }
        for(int i=2; i <= n/2; i++) {
           // System.out.println("Looping " + i);
            if(n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
