import java.util.Scanner;

public class Ex8 {

	public static void main(String[] args) {
		Scanner ohowo = new Scanner(System.in);
		
		long fila1 = ohowo.nextLong();
		long fila2 = ohowo.nextLong();
		long agafa1 = ohowo.nextLong();
		long agafa2 = ohowo.nextLong();
		
		while(fila1 > 0 && fila2 > 0 && agafa1 > 0 && agafa2 > 0) {
			if((fila1+fila2)%(agafa1+agafa2) == 0) {
				if(((fila1%agafa1)%agafa2 == 0 || (fila1%agafa2)%agafa1 == 0) && ((fila2%agafa1)%agafa2 == 0 || (fila2%agafa2)%agafa1 == 0))
					System.out.println("SI");
				else
					System.out.println("NO");
			}	
			else
				System.out.println("NO");
			
			fila1 = ohowo.nextLong();
			fila2 = ohowo.nextLong();
			agafa1 = ohowo.nextLong();
			agafa2 = ohowo.nextLong();
		}
	}
}
