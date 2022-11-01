package _03_Intro_to_Enums;

import java.util.Random;

public enum statesOfMatter {
	SOLID(0), LIQUID(25.5), GAS(100);
	
	
	double celsiusTemp;
	
	 private statesOfMatter(double celsiusTemp) {
	 this.celsiusTemp = celsiusTemp;
	 }
	
	 public static double converttoFarenheit(double celsiusTemp) {
		 celsiusTemp = celsiusTemp*(9/5);
		 celsiusTemp = celsiusTemp+32;
		return celsiusTemp;
		
		 
	 }
	 public static statesOfMatter getRandomState() {
		 Random ran = new Random();
		 int value = ran.nextInt(2);
		return values()[value];  
		
	 }
	 
}
