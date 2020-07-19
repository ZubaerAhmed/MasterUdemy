package MasterUdemy;

public class NumberInWord2 {

	public static void main(String[] args) {
        numberToWords(123);
        numberToWords(0);
        numberToWords(1010);
        numberToWords(1000);
        numberToWords(-12);
	}
//==================================================
    public static void numberToWords(int number) {
    	String s = Integer.toString(number);  
    	//String s = String.valueOf(number);
        if (number < 0) {
            System.out.println("Invalid Value");        
        }else {
        String[] array = s.split("");
        	for(String b : array) {
        		int c = Integer.parseInt(b);
        	//	System.out.println(c);
        		switchNumber(c);         
        	}
        System.out.println();
    }
    }
//-----------------------------------------------
    public static void switchNumber(int testNum) {
        switch (testNum) {
        case 1:
           System.out.print("One ");
           break;
        case 2:
        	System.out.print("Two ");
            break;
        case 3:
        	System.out.print("Three ");
            break;
        case 4:
        	System.out.print("Four ");
            break;
        case 5:
        	System.out.print("Five ");
            break;
        case 6:
        	System.out.print("Six ");
            break;
        case 7:
        	System.out.print("Seven ");
            break;
        case 8:
        	System.out.print("Eight ");
            break;
        case 9:
        	System.out.print("Nine ");
            break;
        case 0:
        	System.out.print("Zero ");
            break;
        }
    }

    
}
