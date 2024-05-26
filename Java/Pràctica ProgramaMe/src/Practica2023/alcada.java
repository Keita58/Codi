package Practica2023;

import java.util.Scanner;

public class alcada {

	public static void main(String[] args) {
		Scanner ohowo = new Scanner(System.in);
		
		while(true) {
			int pedres = ohowo.nextInt();
			if(pedres == 0) break;
			else {
				int mida = 1;
				int midaAnterior = 0;
				int pisos = 0;
				while(true) {
					if(pedres < (mida*mida)-(midaAnterior*midaAnterior)) {
						System.out.println(pisos);
						break;
					}
					else {
						pedres = pedres - (mida*mida);
						pisos++;
						midaAnterior = mida;
						mida += 2;
					}
				}
			}
		}
	}
}
