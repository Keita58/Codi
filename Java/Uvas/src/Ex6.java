import java.util.ArrayList;
import java.util.Scanner;

public class Ex6 {

	public static void main(String[] args) {
		Scanner ohowo = new Scanner(System.in);
		
		try {
			while(ohowo.hasNext()) {
				int nums = ohowo.nextInt();
				int[] llista = new int[nums];
				for(int i = 0; i < nums; i++) {
					llista[i] = ohowo.nextInt();
				}
				
				boolean sortir = false;
				while(!sortir) {
					boolean seguir = true;
					for(int i = 1; i < llista.length && !seguir; i++) {
						if(llista[i] < llista[i-1] && seguir) 
							seguir = false;
					}
					
					if(seguir)
						sortir = true;
					else {
						if(nums%2 == 0) {
							llistaAux.add(llista.get(i));
						}
						else if(nums%2 == 1)
							llistaAux.add(llista.get(i));
					}
				}
				
				System.out.println(llista.size());
			}
		}
		catch(Exception e) {
			
		}
	}
}
