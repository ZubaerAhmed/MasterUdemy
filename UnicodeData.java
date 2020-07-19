package MasterUdemy;

public class UnicodeData {

	public static void main(String[] args) {
		myUnicode();
		System.out.println("========================");
		operator();
		System.out.println("========================");
		equalSign();
	}
//=========================================
	public static void myUnicode() {
		char chinaCurrency = '\u00A5';  // ¥
		System.out.println(chinaCurrency);
		
		String a = " welcome ";
		int b = 2020;
		int c = 2019;
		System.out.println(a + b + c); //string is immutable
		System.out.println(b + c + a); //add both int value
		/*
		 ¥ 
		 welcome 20202019 
		 4039 welcome
		 */
	}
//-----------------------------------------
	public static void operator() {
		int a = 1;		
		a += 2;
		System.out.println(a); // 1 + 2 = 3
		a -= 3;		
		System.out.println(a); // 3 - 3 = 0
		
		int b = 3;
		int c = b++;
		System.out.println(c + " " + b); // c = 3, b = 4
		b = 3;
		int d = ++b; 
		System.out.println(d + " " + b); // d = 4, b = 4
		
		b = 3;
		int e = b--;  
		System.out.println(e + " " + b); // e = 3, b = 2
		b = 3;
		int f = --b;  
		System.out.println(f + " "+ b); // f = 2, b = 2
	}
//-----------------------------------------
	public static void equalSign() {
		boolean value = false;
		//if(value.equals(false)) {  //Cannot invoke equals(boolean) on the primitive type boolean
		//if(value == false) {
		if(! value) { 
			System.out.println("It's false.");
		}
		//Ternary operator
		value = true;
//		boolean value2 = value;
		boolean value2 = (value = false)? true : false;
		if(value2) {
			System.out.println("It's again false");
			
		}
	
	}
	
	
	
}












