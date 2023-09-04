import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public interface NameSet {
	Set<String> names = new HashSet<>();
	Set<String> corps = new HashSet<>();
	Set<Character> characters = new HashSet<>();
	Map<String, String> termMap = new HashMap<>();
	ArrayList<String> cal = new ArrayList<>();

	static void createSet() {
		Scanner corpsScan = null;
		Scanner nameScan = null;
		Scanner charScan = null;
		Scanner termScan = null;
		Scanner calScan = null;

		File corpsFile = new File("src/Values.txt");
		File calFile = new File("src/Calendar.txt");
		File nameFile = new File("src/Names.txt");
		File charFile = new File("src/Characters.txt");
		File termFile = new File("src/Terms.txt");

		try {
			corpsScan = new Scanner(corpsFile);
			nameScan = new Scanner(nameFile);
			charScan = new Scanner(charFile);
			termScan = new Scanner(termFile);
			calScan = new Scanner(calFile);

		} catch (FileNotFoundException e) {
			System.out.println(e.getMessage());
			System.out.print("File failure.");
			System.exit(0);
		}
		while (corpsScan.hasNext()) {
			corps.add(corpsScan.next());
		}
		while (nameScan.hasNext()) {
			names.add(nameScan.next());
		}
		while (charScan.hasNextLine()) {
			characters.add(
					new Character(charScan.nextLine(), charScan.nextLine(), charScan.nextLine(), charScan.nextLine(),
							charScan.nextLine(), charScan.nextLine(), charScan.nextLine(), charScan.nextLine()));
		}
		while (termScan.hasNextLine()) {
			termMap.put(termScan.nextLine(), termScan.nextLine());
		}
		while (calScan.hasNextLine()) {
			cal.add(calScan.nextLine());
		}
		corpsScan.close();
		nameScan.close();
		charScan.close();
		termScan.close();
		calScan.close();
	}

	public static String calendarString() {
		String res = "";
		for (String s : cal) {
			res = res.concat(s + "\n");
		}
		return res.trim();
	}

}
