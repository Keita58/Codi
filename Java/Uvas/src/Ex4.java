import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex4 {

	public static void main(String[] args) {
		Scanner ohowo = new Scanner(System.in);
		
		while(true) {
			int casos = ohowo.nextInt();
			int res = 0;
			HashMap<Integer, Integer> mapa = new HashMap<>();
			
			int num = -1;
			if(casos > 0) {
				for(int i = 0; i < casos; i++) {
					num = ohowo.nextInt();
					if(mapa.containsKey(num))
						mapa.put(num, mapa.get(num)+1);
					else
						mapa.put(num, 1);
				}
				for(int nums : mapa.keySet()) {
					res += mapa.get(nums)/2;
				}
				System.out.println(res);
			}
			else
				break;
		}
	}
}
