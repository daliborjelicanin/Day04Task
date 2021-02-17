package task04;

/*
 * Napisati metodu koja prikazuje frekvenciju pojavljivanja svakog znaka u stringu.
 *  asaa112a 
 *  a -> 4
 *  s -> 1
 *  1 -> 2
 *  2 -> 1
 */

public class Task04DaliborJelicanin {

	public static void frequencyOfCharacterInString(String str) {

		int[] freq = new int[str.length()];
		int i, j;

		char[] charArray = new char[str.length()];
		for (int x = 0; x < str.length(); x++) {
			charArray[x] = str.charAt(x);
		}

		for (i = 0; i < str.length(); i++) {
			freq[i] = 1;
			for (j = i + 1; j < str.length(); j++) {
				if (charArray[i] == charArray[j]) {
					freq[i]++;

					charArray[j] = '0';
				}
			}
		}

		for (i = 0; i < freq.length; i++) {
			if (charArray[i] != ' ' && charArray[i] != '0')
				System.out.println(charArray[i] + " -> " + freq[i]);
		}
	}

	public static void main(String args[]) {
		String str = "asaa112a333";
		frequencyOfCharacterInString(str);
	}

}
