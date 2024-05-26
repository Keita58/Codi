package Practica2023;

import java.util.Scanner;

public class nums {

	public static void main(String[] args) {
		Scanner ohowo = new Scanner(System.in);
		
		while(true) {
			int num = ohowo.nextInt();
			if(num == 0) break;
			else {
				String res = new String();
				while(num > 0) {
					if(num >= 1000000) {
						num -= 1000000;
						res += 'H';
					}
					else if(num >= 100000 && num < 1000000) {
						num -= 100000;
						res += 'R';
					}
					else if(num >= 10000 && num < 100000) {
						num -= 10000;
						res += 'D';
					}
					else if(num >= 1000 && num < 10000) {
						num -= 1000;
						res += 'F';
					}
					else if(num >= 100 && num < 1000) {
						num -= 100;
						res += 'C';
					}
					else if(num >= 10 && num < 100){
						num -= 10;
						res += 'G';
					}
					else if(num >= 0 && num < 10) {
						num -= 1;
						res += 'T';
					}
					else
						break;
				}
				System.out.println(res);
			}
		}
	}
}
