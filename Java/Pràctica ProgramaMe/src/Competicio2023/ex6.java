package Competicio2023;

import java.util.Scanner;
import java.util.ArrayList;
public class ex6 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int cprova = sc.nextInt();
		sc.nextLine();
		ArrayList<String> Ronda = new ArrayList<>();
		ArrayList<String> NovaRonda = new ArrayList<>();
		for (int i = 0; i < cprova; i++) {
			String Texto = sc.next();
			Ronda.add(Texto);
		}
		
		int Res = 0;
		int LastRes = 0;
		for (int i = 0; i < (cprova + (cprova - 2)) / 2; i++) {
			Res = sc.nextInt();
			LastRes = sc.nextInt();
			if (Ronda.size() == 0) {
				int Si = NovaRonda.size();
				for (int a = 0; a < Si; a++) {
					Ronda.add(NovaRonda.get(0));
					NovaRonda.remove(0);
				}
			}
			if (Res > LastRes) {
				NovaRonda.add(Ronda.get(0));
				Ronda.remove(0);
				Ronda.remove(0);
			} else {
				NovaRonda.add(Ronda.get(1));
				Ronda.remove(0);
				Ronda.remove(0);
			}
		}
		sc.nextInt();
		System.out.println(NovaRonda.get(0));
	}
}


