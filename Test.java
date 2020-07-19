package MasterUdemy;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		StrinSplit(1234);
		
	}

	public static void StrinSplit(int num) {
		//int num=1020; // int number
		List<Integer> list = new ArrayList<Integer>();
		while (num > 0) {
			int b =  num % 10;
		   // System.out.println(b);
		    list.add(b);
		    num = num / 10;
		}
		
		for(int i : list) {
			System.out.println(i);
		}
	}
	
	
}
