package task01;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/*
 * Kreirati klasu zaposleni sa atributima:
 * 	ime, plata, sef klase Sef.
 * Klasa ima:
 * 	konstruktor koji ima dva argumenta  kojima se postavljaju vrednosti za ime i platu.
 * 	metodu postaviPlatu
 *  metodu postavi sefa
 *  metodu prikazi kojima se prikazuju podaci o osobi ime, plata i pseudonim sefa
 *  
 *  Kreirati klasu Sef sa atributima:
 *   pseudonim
 *   odeljenje
 *   starost
 *  Klasa ima:
 *   konstruktor sa jednim argumentom kojim se postavlja pseudonim
 *   metodu povecaj platu koja promeni platu zaposlenom  ali samo ako je on sef zaposlenom
 *                        i ako je plata pozitivan broj      
 *   metodu prikazi koja prikazuje podatke
 *   
 * Napisati glavni program.
 * 	Kreirati 3 zaposlena i 2 sefa sa razlicitim pseudonimima.
 *  Platu svima postaviti na 521.
 *  Dodeliti 1.zaposlenom 1.sefa, 2.zaposlenom 2.sefa.
 *  Prikazati podatke o svim zaposlenima.
 *  
 *  1.sef pokusava svim zaposlenima da promeni platu za 100.
 *  Prikazati podatke o svim zaposlenima
 *  
 *  2.sef pokusava da smanjim platu svom zapolsenom za 100.
 *  Ispisati podatke o tom zaposlenom.
 *  
 *  Direktno samnjiti platu svim zaposlenima za 100.
 *  Ispisati podatke o svim zaposlenima.
 */

public class Task01DaliborJelicanin {

	public static void main(String[] args) {

		Employee employee1 = new Employee("zaposleni 1", 521);
		Employee employee2 = new Employee("zaposleni 2", 521);
		Employee employee3 = new Employee("zaposleni 3", 521);

		Boss boss1 = new Boss("sef 1");
		Boss boss2 = new Boss("sef 2");

		employee1.setBoss(boss1);
		employee2.setBoss(boss2);

		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);

		System.out.println("===================================");
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);

		boss1.updateSalary(employee1, 100);
		boss1.updateSalary(employee2, 100);
		boss1.updateSalary(employee3, 100);

		System.out.println("-----------------------");
		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
		System.out.println("===================================");

		System.out.println(employee2);
		boss2.reduceSalary(employee2, 100);
		System.out.println(employee2);
		System.out.println("===================================");

		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);

		List<Employee> employeeList = new ArrayList<>();
		employeeList.add(employee1);
		employeeList.add(employee2);
		employeeList.add(employee3);

		for (Employee e : employeeList) {
			e.reduceSalary(100);
		}

		System.out.println(employee1);
		System.out.println(employee2);
		System.out.println(employee3);
	}

}
