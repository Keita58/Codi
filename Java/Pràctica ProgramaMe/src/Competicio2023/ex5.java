package Competicio2023;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;
import java.util.TreeMap;

class Equip {
	
	int num = 0;
	int punts = 0;
	int golsFet = 0;
	int golsFincat = 0;
	
	public int getPunts() {
		return punts;
	}
}

public class ex5 {

	public static void main(String[] args) {
		Scanner ohowo = new Scanner(System.in);
		ArrayList<Equip> aux = new ArrayList<Equip>();
		int N = ohowo.nextInt(); //Equips
		int Q = ohowo.nextInt(); //Classifiquen
		
		for(int i = 0; i < N*(N-1)/2; i++) {
			int eq1 = ohowo.nextInt();
			int eq2 = ohowo.nextInt();
			int g1 = ohowo.nextInt();
			int g2 = ohowo.nextInt();
			Equip e1 = new Equip();
			Equip e2 = new Equip();
			e1.num = eq1;
			e2.num = eq2;
			
			if(g1 > g2) {
				if(aux.contains(e1)) {
					e1.golsFet += g1;
					e1.golsFincat += g2;
					e1.punts += 3;
				}
				else {
					e1.golsFet = g1;
					e1.golsFincat = g2;
					e1.punts = 3;
				}
				
				if(aux.contains(e2)){
					e2.golsFet += g2;
					e2.golsFincat += g1;
				}
				else {
					e2.golsFet = g2;
					e2.golsFincat = g1;
				}
			}
			else if(g1 < g2) {
				if(aux.contains(e2)) {
					e2.golsFet += g2;
					e2.golsFincat += g1;
					e2.punts += 3;
				}
				else {
					e2.golsFet = g2;
					e2.golsFincat = g1;
					e2.punts = 3;
				}
				
				if(aux.contains(e1)){
					e1.golsFet += g1;
					e1.golsFincat += g2;
				}
				else {
					e1.golsFet = g1;
					e1.golsFincat = g2;
				}
			}
			else {
				if(aux.contains(e1)) {
					e1.golsFet += g1;
					e1.golsFincat += g2;
					e1.punts += 1;
				}
				else {
					e1.golsFet = g1;
					e1.golsFincat = g2;
					e1.punts = 1;
				}
				
				if(aux.contains(e2)){
					e2.golsFet += g2;
					e2.golsFincat += g1;
					e1.punts += 1;
				}
				else {
					e2.golsFet = g2;
					e2.golsFincat = g1;
					e1.punts = 1;
				}
			}	
		}
		
		boolean empat = false;	
		Collections.sort(aux, Comparator.comparing(Equip::getPunts()));
		for(int j = 0; j < N; j++) {
			
		}
		
		for(int j = 0; j < Q; j++) 
			if(aux.get(j) == aux.get(j + 1)) {
				System.out.println("EMPATE");
				empat = true;
			}
		
		if(!empat) {
			for(int j = 0; j < Q; j++) {
				System.out.print(aux.get(j)+" ");
			}
		}
	}
}
