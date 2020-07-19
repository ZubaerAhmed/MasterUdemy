package MasterUdemy;

public class MilesToKilometer {

	public static void main(String[] args) {
		Miles.printing(100.67);

	}
}
//==========================================
class Miles{
	public static long convert(double km) {
		long lo = Math.round(km / 1.609);
		return lo;
	}
//-----------------------------------------
	public static void printing(double km) {
		if(km <0) {
			System.out.println("Invalid value");
		}else {
			long miles = convert(km);
			System.out.println(km + "km/h = " + miles + "mi/h");
		}
	}
}
