package sääpalvelutesti;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.OptionalDouble;
import java.util.Scanner;

public class Saapalvelu {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int freeze = 100;
		ArrayList<Double> saapalvelu = new ArrayList<Double>();
		double annetut;
		int paiva=1;
		
		
		do
			
			{
				System.out.println("Anna "+ paiva + " päivän lämpötila: ");
					annetut = Double.parseDouble(in.nextLine());
						saapalvelu.add(annetut);
						paiva++;
						
		 
			} while (annetut!=freeze);
		
		int index = saapalvelu.size() - 1;
		saapalvelu.remove(index);
		for(int i=0; i<saapalvelu.size();i++)
			System.out.println(saapalvelu.get(i));
		
		int index_max = saapalvelu.indexOf(Collections.max(saapalvelu));
		index_max++;
		System.out.println("lämpimintä oli "+ index_max + " päivänä " + getMax(saapalvelu) + " astetta");
		
		System.out.println("Lämpötilojen keskiarvo: "+ calculateAverage(saapalvelu));
		
		
		
		in.close();
		
	}
	
	private static double calculateAverage(ArrayList <Double> saapalvelu) {
		OptionalDouble average = saapalvelu
	            .stream()
	            .mapToDouble(a -> a)
	            .average();
		return average.getAsDouble();
}
	public static double getMax(ArrayList <Double> saapalvelu) {
		double max= Integer.MIN_VALUE;
		for(int i=0; i<saapalvelu.size(); i++) {
			if(saapalvelu.get(i) > max) {
				max = saapalvelu.get(i);
				
			}
		}
		return max;
	}
	
}