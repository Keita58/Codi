package Practica2023;

import java.util.Scanner;

public class piramide {

	public static void main(String[] args) {

		Scanner ohowo = new Scanner(System.in);
		int casos = ohowo.nextInt();
		
		for(int i = 0; i < casos; i++) {
			int any1 = ohowo.nextInt();
			int anyReferencia = ohowo.nextInt();
			int any2 = ohowo.nextInt();
			int calc1, calc2;
			calc1 = calc2 = 0;
			
			if(any1 < 0 && anyReferencia > 0 && any2 > 0) {
				calc1 = anyReferencia + any1;
				calc2 = any2 - anyReferencia;
			}
			else if(any1 < 0 && anyReferencia < 0 && any2 > 0) {
				calc1 = any1 - anyReferencia;
				calc2 = any2 + anyReferencia;
			}
			else {
				calc1 = anyReferencia - any1;
				calc2 = any2 - anyReferencia;
			}
			
			if(calc1 == 0) calc1 = 1;
			if(calc2 == 0) calc2 = 1;
			
			if(Math.abs(calc1) > Math.abs(calc2))
				System.out.println(any2);
			else if(Math.abs(calc1) < Math.abs(calc2))
				System.out.println(any1);
			else
				System.out.println("EMPATE");
		}
	}
}
