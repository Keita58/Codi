package Competicio2023;

import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

public class ex4 {

	public static void main(String[] args) {
		Scanner ohowo = new Scanner(System.in);
		TreeMap<Integer, List<String>> mapa = new TreeMap<>();
		int casos = ohowo.nextInt();
		
		for(int i = 0; i < casos; i++) {
			int num = ohowo.nextInt();
			ohowo.nextLine();
			if(mapa.get(num) != null)
				
			//mapa.put(num, ohowo.nextLine());
		}
		
		int casosBusca = ohowo.nextInt();
		for(int i = 0; i < casosBusca; i++) {
			int num = ohowo.nextInt();
			
			
		}
	}
}
