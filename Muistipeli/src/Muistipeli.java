import java.util.Random;
import java.util.Scanner;


public class Muistipeli {

	public static void main(String[] args) {
		// J‰‰t‰v‰‰ koodia tulossa
		
		Random r = new Random();
	
		int[] numerot = new int[7];
		
		Scanner in = new Scanner (System.in);
		
		int[] vastaukset = new int[7];
		
		int oikeaVastaus = 0;
		
		float Prosentti;
		
				
		System.out.println("Yrit‰ painaa numerot mieleesi:");	
		
		for (int i=0; i<numerot.length; i++)
			{
				numerot[i]= (r.nextInt(7)+1);
				System.out.print(numerot[i]);
			}
		
		try
			{
				Thread.sleep(5000);
			}
				catch(InterruptedException ex) 
			{		
					Thread.currentThread().interrupt();
			}
			
			
			for (int i = 0; i < 50; ++i)
			{
				System.out.println();	
			}
			
			System.out.println("Seuraavaksi p‰‰set syˆtt‰m‰‰n ‰sken n‰kem‰si luvut.");
			
	
		for (int i=0; i<vastaukset.length; i++)
		{
			System.out.println("Syˆt‰ numero " + (i+1));
			vastaukset[i] = Integer.parseInt(in.nextLine());
		}		
		
				System.out.println("\nSinun vastauksesi: ");
				for (int i=0; i<vastaukset.length; i++)
					{
						System.out.print(vastaukset[i]);
					}
					
				System.out.println("\n\nOikea rivi oli: ");	
				for (int i=0; i<numerot.length; i++)
					{
						System.out.print(numerot[i]);
					}
		
			
			//vastausten tarkastelu
				System.out.println(" ");
		for (int i=0 ; i<vastaukset.length; i++)
		{
			if (vastaukset[i]==numerot[i])
			{
			oikeaVastaus++;
			}
		}
			
		System.out.println("\n\nOikeita vastauksia on: " + oikeaVastaus +"/" + numerot.length);
		Prosentti = (float)((oikeaVastaus*100)/numerot.length);
			System.out.println("Sait "+Prosentti+"% oikein.");
		
			in.close();	
		}
		
	}
		



	