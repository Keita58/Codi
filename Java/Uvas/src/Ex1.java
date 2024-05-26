import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		Scanner ohowo = new Scanner(System.in);
		int casos = ohowo.nextInt();
		
		for(int i = 0; i < casos; i++) {
			int raim = ohowo.nextInt();
			int pers = ohowo.nextInt();
			
			if(raim/pers >= 12)
				System.out.println("SI");
			else
				System.out.println("NO");

		}
	}

}
