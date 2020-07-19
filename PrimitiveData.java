package MasterUdemy;

public class PrimitiveData {

	public static void main(String[] args) {
		primitive();
		System.out.println("========================");
		castingData();
		System.out.println("========================");
		doubleData();
	}
//------------------------------------------
	public static void primitive() {
		int minimumInt = Integer.MIN_VALUE;
		int maximumInt = Integer.MAX_VALUE;
		System.out.println("----int-------------------");
		System.out.println(minimumInt +"\n" + maximumInt);
	
		int maxNumber = 2_147_483_647;
		//int number =2147483648;
		System.out.println("---byte------------------");
		byte minimumByte = Byte.MIN_VALUE;
		byte maximumByte = Byte.MAX_VALUE;
		System.out.println(minimumByte +"\n" + maximumByte);
		
		System.out.println("---Short-----------------");
		short minimumShort = Short.MIN_VALUE;
		short maximumShort = Short.MAX_VALUE;
		System.out.println(minimumShort +"\n" + maximumShort);
	
		System.out.println("---Long------------------");
		// use L: long value = 100L;
		long minimumLong = Long.MIN_VALUE;
		long maximumLong = Long.MAX_VALUE;
		System.out.println(minimumLong +"\n" + maximumLong);
	}
//-------------------------------------------
	public static void castingData() {
		byte valueByte = 10;
		short valueShort = 20;
		int valueInt = 30;
		long valueLong = 50000L;
		
		long totalLong = valueLong + 10L*(valueByte+valueShort+valueInt);
		long totalLong2 = valueLong + 10*(valueByte + valueShort + valueInt); //NO 'L'
		short totalShort = (short)(5000 + 10*(valueByte + valueShort + valueInt));
		
		System.out.println(totalLong + "\n" + totalLong2 + "\n" + totalShort);
	}
//-------------------------------------------
	public static void doubleData() {
		int valueInt = 5;
		float valueFloat = 5f;  
		double valueDouble = 5d;
		float valueFloat2 = (float)valueDouble; //Better use 'f'		
		System.out.println(valueInt % 2);
	}
}
/*  CONSOLE
----int------------------- 
-2147483648
2147483647
---byte------------------
-128
127
---Short-----------------
-32768
32767
---Long------------------
-9223372036854775808
9223372036854775807
========================
50600
50600
5600*/