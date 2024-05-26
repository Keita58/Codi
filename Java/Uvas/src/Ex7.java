import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		Scanner ohowo = new Scanner(System.in);
		int casos = ohowo.nextInt();
		
		for(int i = 0; i < casos; i++) {
			int num = ohowo.nextInt();
			
			int aux = 0;
			int j = 1;
			int calc = 0;
			
			while(true) {
				calc += j;
				num -= calc;
				if(num >= 0) {
					aux++;
					j++;
				}
				else
					break;
			}
			System.out.println(aux);
		}
	}
}
