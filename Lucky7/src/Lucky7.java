import java.util.Random;
import java.util.Scanner;

public class Lucky7 {
	public static void main(String[] args) {

		Random random = new Random();
		Scanner in = new Scanner(System.in);

		int randomNumero;
		int randomNumero2;
		int randomNumero3;
		int pelaajansyottama;
		String vastaus;

		System.out.println("How much money?");
		vastaus = in.nextLine();
		pelaajansyottama = Integer.parseInt(vastaus);

		do {
			pelaajansyottama--;
			System.out.println("Money " + pelaajansyottama + "€");
			randomNumero = random.nextInt(10) + 1;
			randomNumero2 = random.nextInt(10) + 1;
			randomNumero3 = random.nextInt(10) + 1;
			System.out.println("You throw " + randomNumero);
			System.out.println("You throw " + randomNumero2);
			System.out.println("You throw " + randomNumero3);

			if (randomNumero == 7 || randomNumero2 == 7 || randomNumero3 == 7) {
				System.out.println("you WIN this round!");
				pelaajansyottama++;
			} else {
				System.out.println("You LOST this round");
			}
			if (randomNumero == 7 && randomNumero2 == 7 || randomNumero == 7 && randomNumero3 == 7
					|| randomNumero2 == 7 && randomNumero3 == 7) {
				pelaajansyottama += 2;
				System.out.println("You win!");
			}
			if (randomNumero == 7 && randomNumero2 == 7 && randomNumero3 == 7) {
				pelaajansyottama += 5;
				System.out.println("Big win!!");
			}
			System.out.println("Do you wanna play again (y/n)?");
			vastaus = in.nextLine();
			if (pelaajansyottama <= 0) {
				System.out.println("No money, no funny");
				break;
			}
			if (vastaus.equals("n")) {
				System.out.println("Thank you for the game.");
				break;
			}
		} while (vastaus.equals("y"));
		in.close();
	}
}
