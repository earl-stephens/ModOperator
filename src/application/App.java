package application;

public class App {
	public static void main(String[] args) {
		
		int intValue1 = 123;
		int intValue2 = 10;
		
		System.out.println(intValue1 / intValue2);
		//answer is 12.  Since these are ints, don't get a
		//remainder.  Would have to cast one to a double in
		//order to get a remainder
		
		//what if you just want the remainder? use mod
		
		System.out.println(intValue1 % intValue2);
		
		for(int i = 0; i < 1000; i++) {
			if(i % 100 == 0) {
				System.out.println("Processed " + i + " lines");
			}
		}
	}
}
