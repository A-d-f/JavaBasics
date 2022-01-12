import java.util.Scanner;

public class Uusinta {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		String enimi;
		String snimi;
		String vt;

		System.out.println("Etunimi?");
		enimi = in.nextLine();
		System.out.println("Sukunimi?");
		snimi = in.nextLine();
		System.out.println("Verkkotunnus?");
		vt = in.nextLine();

		if (enimi.equals("") || snimi.equals("") || vt.equals("")) {
			System.out.println("Virhe! Jokin tiedoista puuttui!");
		} else {
			System.out.println(GenerateUsername(enimi, snimi));
			GenerateEmail(enimi, snimi, vt);
		}
	}

	public static String GenerateUsername(String enimi, String snimi) {
		if (snimi.length() > 4) {
			snimi = snimi.substring(snimi.length() - 4);
		}
		enimi = enimi.substring(0, 4);
		String tunnus = (enimi.toLowerCase() + snimi.toLowerCase());

		return tunnus;

	}

	public static void GenerateEmail(String enimi, String snimi, String vt) {
		System.out.print(enimi.toLowerCase() + snimi.toLowerCase() + "@" + vt);

	}

}
