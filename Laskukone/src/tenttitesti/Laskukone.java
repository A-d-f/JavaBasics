package tenttitesti;

import java.util.Scanner;

public class Laskukone {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		int vastaus;
		int vastaus2;
		String laskutoimitus;
		String uudestaan;
		
		tulostaOtsikko();
		
		do {
		System.out.println("Lets lasketaan!");
		System.out.println("Anna luku 1:");
		vastaus=Integer.parseInt(in.nextLine());
		System.out.println("Anna luku 2:");
		vastaus2=Integer.parseInt(in.nextLine());
		System.out.println("Valitse +, - tai *");
		laskutoimitus=in.nextLine();
		
		System.out.println(laskin(vastaus, vastaus2, laskutoimitus));
		System.out.println("Haluatko laskea uudestaan? (k/e)");
		uudestaan=in.nextLine();
		} while (uudestaan.equals("k"));
		
		

	} //main päättyy
	public static void tulostaOtsikko() {
		System.out.println("**********Laskukone***********");
	}
	
	public static int laskin (int luku1, int luku2, String laskutoimitus) {
		int lasku = 0;
		if (laskutoimitus.equals("+")) {
			lasku = luku1+luku2;
			
		}
		if (laskutoimitus.equals("-")) {
			lasku= luku1-luku2;
		}
		if (laskutoimitus.equals("*")) {
			lasku= luku1*luku2;
		}
		return lasku;
	}

} 


