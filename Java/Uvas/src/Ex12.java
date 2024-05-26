import java.util.HashMap;
import java.util.Scanner;

public class Ex12 {

	public static void main(String[] args) {
		Scanner ohowo = new Scanner(System.in);
		
		HashMap<Integer, Integer> agraden = new HashMap<>();
		HashMap<Integer, Integer> desagraden = new HashMap<>();

		int canals = ohowo.nextInt();
		int persones = ohowo.nextInt();
		for(int i = 1; i <= canals; i++) {
			agraden.put(i, 0);
			desagraden.put(i, 0);
		}
		
		for(int i = 0; i < persones; i++) {
			int num = ohowo.nextInt();
			agraden.put(num, agraden.get(num)+1);

			num = ohowo.nextInt();
			desagraden.put(num, desagraden.get(num)+1);
		}
		
		int be, malament, pse;
		be = malament = pse = 0;
		
		for(int aux : agraden.keySet()) {
			if(agraden.get(aux) == persones)
				be = persones;
			else if(agraden.get(aux) > 0)
				pse++;
		}
		
		for(int aux : desagraden.keySet()) {
			if(desagraden.get(aux) > persones/2)
				malament++;
			else if(desagraden.get(aux) > 0)
				pse++;
		}
		
		System.out.println(be + " " + malament + " " + pse);
	}
}
