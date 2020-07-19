package MasterUdemy;

public class PrintEquals {

	public static void main(String[] args) {
		printEqual(1,2,3);	
		printEqual(1,1,1);
		printEqual(-1,-1,-1);
	}
	public static void printEqual(int firstN, int secondN, int thirdN){
	    if (firstN < 0 || secondN < 0 || thirdN < 0){
	        System.out.println("Invalid Value");
	    }
	    else if (firstN == secondN && firstN == thirdN && secondN == thirdN) {
	    	System.out.println("All numbers are same");
	    	}
	    else {
	        System.out.println("Numbers are different");
	    }	      	    
	}
}
