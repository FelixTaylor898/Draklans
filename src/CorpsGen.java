import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class CorpsGen {
	public static String corps() {
		String result = "";
		result += "Corps of " + Util.generate(NameSet.corps) + "\n\n";
		result += "Leader\n";

		ArrayList<Integer> council = new ArrayList<>();
		for (int k = 0; k < 12; k++) {
			council.add(k);
		}

		result += new Entity(TypeData.types[council.remove(ThreadLocalRandom.current().nextInt(0, council.size()))],
				ageGen(200, 400)).toString() + genDragon() + "\n\n";

		result += "Main Council\n";

		for (int k = 0; k < 8; k++) {
			result += new Entity(TypeData.types[council.remove(ThreadLocalRandom.current().nextInt(0, council.size()))],
					ageGen(30, 400)).toString() + genDragon() + "\n";
		}

		result += "\nGreen Council\n";
		for (int k = 0; k < 3; k++) {
			result += new Entity(TypeData.types[council.remove(ThreadLocalRandom.current().nextInt(0, council.size()))],
					ageGen(13, 30)).toString() + genDragon() + "\n";
		}

		result += "\nMembers\n";
		for (int k = 0; k < 50; k++) {
			result += new Entity(ageGen(0, 400)).toString() + genDragon() + "\n";

		}

		return result.trim();

	}

	private static String genDragon() {
		return (ThreadLocalRandom.current().nextInt(0, 2) != 0) ? ""
				: " (Dragon: " + new Entity(ageGen(0, 400)).toString() + ")";
	}

	private static int ageGen(int lower, int limit) {
		return ThreadLocalRandom.current().nextInt(lower, limit);
	}

}