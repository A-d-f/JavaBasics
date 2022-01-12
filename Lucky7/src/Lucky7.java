import java.util.Random;
import java.util.Scanner;

public class Lucky7 {
	public static void main(String[] args) {
		
		Random random=new Random();
		Scanner in = new Scanner(System.in);
		Scanner two = new Scanner(System.in);
		int randomNumero;
		int randomNumero2;
		int randomNumero3;
		int pelaajansyottama;
		String vastaus;
		
		
		System.out.println("Paljonko rahaa laitat sisään?");
		vastaus = in.nextLine();
		pelaajansyottama = Integer.parseInt(vastaus);
		
		
		do
		{
			pelaajansyottama--;
			System.out.println("Sinulla on rahaa " + pelaajansyottama + "€");
				randomNumero = random.nextInt(10)+1;
				randomNumero2 = random.nextInt(10)+1;
				randomNumero3 = random.nextInt(10)+1;
			
					System.out.println("Heitit " + randomNumero);
						System.out.println("Heitit " + randomNumero2);
							System.out.println("Heitit " + randomNumero3);
						
						if (randomNumero == 7 || randomNumero2 == 7 || randomNumero3 == 7)
						{
						System.out.println("VOITIT tällä kierroksella!");
						pelaajansyottama++ ;
						}
						else
						{ 
						System.out.println("HÄVISIT tällä kierroksella!");	
						
						}
						
								if (randomNumero == 7 && randomNumero2 == 7 || randomNumero == 7 && randomNumero3 == 7 || randomNumero2 == 7 && randomNumero3 == 7)
									{
									pelaajansyottama+=2;
									System.out.println("Voitit kivasti hilloo.");
									}
							
								if (randomNumero == 7 && randomNumero2 == 7 && randomNumero3 == 7)
									{
									pelaajansyottama+=5;
									System.out.println("Sie voitit ihan hulluna massia!!!");
									}
						
		
		System.out.println("Haluatko pelata uuden kierroksen (k/e)?");
		vastaus = in.nextLine();
		
				if (pelaajansyottama <= 0) 
					{
					System.out.println("Rahat on loppu. Myy volvosi.");
					break;
					}
				
					if (vastaus.equals("e")) 
						{
						System.out.println("Kiitos pelistä.");
						break;
						}
				
	} while (vastaus.equals("k"));
		
			in.close();	
				
	}
}





