import java.util.Scanner;

public class Ex3 {

	public static void main(String[] args) {
		Scanner ohowo = new Scanner(System.in);
		int casos = ohowo.nextInt();
		ohowo.nextLine();
		
		for(int i = 0; i < casos; i++) {
			String num = ohowo.nextLine();
			num = num.replaceAll(" ", "");
			
			String[] res = num.split("");
			String num1 = res[0]+res[1]+res[2];
			String num2 = res[3]+res[4]+res[5];
			
			for(int j = 0; j < res.length; j++) {
				System.out.println(res[j] + " ");
			}
			
		}
	}
}
