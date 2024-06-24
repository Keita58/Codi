import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner ohowo = new Scanner(System.in);

        String[] separat = ohowo.nextLine().split(" ");
        for (String paraula : separat) {
            String[] lletres = paraula.split("");
            for(int i = 0; i < lletres.length; i++) {
                if(lletres[i].charAt(0) < 'm')
            }
        }

        for(int i = 0; i < separat.length; i++) {
            System.out.println(separat[i]);
        }
    }
}