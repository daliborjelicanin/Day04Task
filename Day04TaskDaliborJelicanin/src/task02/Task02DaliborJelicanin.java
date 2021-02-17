package task02;

import java.util.Scanner;

public class Task02DaliborJelicanin {

	// kreirati klasu kvadrat. Klasa kvadrat sadrzi:
	// atribut duzinaStranice
	// neparametrizovan i parametrizovan konstruktor
	// metodu izracunaj povrsinu
	// metodu izracunaj obim
	// metodu prikazi(: "kvadrat", duzina stranice, obim i povrsina)
	//
	// kreirati klasu pravougaonik. Klasa pravougaonik sadrzi:
	// atribut duzinaStranice a i b
	// neparametrizovan i parametrizovan konstruktor
	// metodu izracunaj povrsinu
	// metodu izracunaj obim
	// metodu prikazi(: "pravougaonik", duzina stranica a i b, obim i povrsina)
	//
	// glavni program:
	// kreirati 2 kvadrata i 4 pravougaonika i ubaciti u niz
	// u gl. programu napraviti korisnicki meni:
	// 1. prikazi sve oblike
	// rb. oblik dimenzije obim povrsina
	// 1. kvadrat
	// 2.pravougaonik
	// 3.pravougaonik
	// 4. kvadrat
	// 5.pravougaonik
	// 2. prikazi kvadrate
	// 3. prikazi pravougaonike
	// 0. kraj programa

	public static void main(String[] args) {

		Square square1 = new Square(4);
		Square square2 = new Square(5);
		Rectangle rectangle1 = new Rectangle(2, 3);
		Rectangle rectangle2 = new Rectangle(4, 5);
		Rectangle rectangle3 = new Rectangle(2, 7);

		Object[] shapes = new Object[] { square1, square2, rectangle1, rectangle2, rectangle3 };

		Scanner scanner = new Scanner(System.in);
		boolean flag = true;

		do {
			System.out.println(
					"Choose an option:\n 1.Show all shapes\n 2.Show squares\n 3.Show rectangles\n 0 End of program");
			int choice = scanner.nextInt();

			switch (choice) {
			case 1:
				System.out.println("# \tshape \t\tdimensions \t\tvolume \t\tsurface area");
				System.out.println();
				for (int i = 0; i < shapes.length; i++) {
					System.out.println(i + 1 + "\t" + shapes[i].toString());
				}
				flag = false;
				break;
			case 2:
				System.out.println("# \tshape \t\tdimensions \t\tvolume \t\tsurface area");
				System.out.println();
				for (int i = 0; i < shapes.length; i++) {
					if (shapes[i] instanceof Square)
						System.out.println(i + 1 + "\t" + shapes[i].toString());
				}
				flag = false;
				break;
			case 3:
				System.out.println("# \tshape \t\tdimensions \t\tvolume \t\tsurface area");
				System.out.println();
				for (int i = 0; i < shapes.length; i++) {
					if (shapes[i] instanceof Rectangle)
						System.out.println(i + 1 + "\t" + shapes[i].toString());
				}
				flag = false;
				break;
			case 0:
				System.exit(0);
			default:
				System.out.println("You have selected a non-existent option, try again \n");
			}
		} while (flag);

		scanner.close();
	}
}
