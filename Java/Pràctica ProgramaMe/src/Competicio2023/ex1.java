package Competicio2023;

import java.util.ArrayList;
import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		Scanner ohowo = new Scanner(System.in);
		//ArrayList<String> llista = new ArrayList<>();
		int casos = ohowo.nextInt();
		ohowo.nextLine();
		
		for(int i = 0; i < casos; i++) {
			String cas = ohowo.nextLine();
			String[] aux = cas.split("");
			int res = 0;
			
			for(int j = 0; j < aux.length; j++) {
				switch(Integer.parseInt(aux[j])%2) {
				case 0:
					res += (Integer.parseInt(aux[j])*3+1);
					break;
				case 1:
					res += (Integer.parseInt(aux[j])*2+7);
					break;
				}
			}
		}
	}
}
