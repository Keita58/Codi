import java.util.Scanner;

public class Ex5 {

	public static void main(String[] args) {
		Scanner ohowo = new Scanner(System.in);
		
		while(true) {
			int num = ohowo.nextInt();
			
			if(num == 0)
				break;
			else {
				num = num%1461;
				
				if(num == 30 || num == 31 || num == 28 || num == 29) 
					System.out.println("SI");
				else if(num < 28)
					System.out.println("NO");
				else {
					if(num > 1095) {
						num %= 1095;
						int vegades31 = 0;
						int vegades30 = 0;
						int vegades29 = 0;
						while(true) {
							if((num%31 == 0 || num%31 == 29 || num%31 == 30) && vegades31 < 7 && num > 0) {
								num -= 31;
								vegades31++;
							}
							else if((num%30 == 0 || num%30 == 1) && vegades30 < 4 && num > 0) {
								num -= 30;
								vegades30++;
							}
							else if((num%29 == 0 || num%29 == 2) && vegades29 < 1 && num > 0) {
								num -= 29;
								vegades29++;
							}
							else
								break;
						}						
					}
					else {
						if(num > 365)
							num %= 365;
						int vegades31 = 0;
						int vegades30 = 0;
						int vegades28 = 0;
						while(true) {
							if((num%31 == 0 || num%31 == 28 || num%31 == 30) && vegades31 < 7 && num > 0) {
								num -= 31;
								vegades31++;
							}
							else if((num%30 == 0 || num%30 == 1) && vegades30 < 4 && num > 0) {
								num -= 30;
								vegades30++;
							}
							else if((num%28 == 0 || num%28 == 2) && vegades28 < 1 && num > 0) {
								num -= 28;
								vegades28++;
							}
							else
								break;
						}
					}
					if(num != 0)
						System.out.println("NO");
					else
						System.out.println("SI");
				}
			}
		}
	}
}
