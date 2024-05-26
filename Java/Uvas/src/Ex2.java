import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		Scanner ohowo = new Scanner(System.in);
		int res = 0;
		
		while(true) {
			int casos = ohowo.nextInt();
			res = 0;
			int tomas = 0;
			for(int i = 0; i < casos; i++) {
				tomas = ohowo.nextInt();
				if(tomas == 0)
					break;
				else if(i > 0) {
					res--;
					res += tomas;
				}
				else {
					res += tomas;
				}
			}
			if(tomas == 0)
				break;
			System.out.println(res);
		}
	}
}
