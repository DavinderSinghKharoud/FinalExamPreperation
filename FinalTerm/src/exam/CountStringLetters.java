package exam;

public class CountStringLetters {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "god is one1";
		int countLetters = 0;
		int countSpaces = 0;
		int countNumbers = 0;
		int countOthers = 0;
		char[] b = a.toCharArray();
		for (int count = 0; count < b.length; count++) {
			if (Character.isLetter(b[count])) {
				countLetters++;
			} else if (Character.isDigit(b[count])) {
				countNumbers++;
			} else if (Character.isSpace(b[count])) {
				countSpaces++;
			} else {
				countOthers++;
			}
		}
		System.out.println("letters: " + countLetters);
		System.out.println("Digits: " + countNumbers);
		System.out.println("Spaces: " + countSpaces);
	}

}
