import java.util.Scanner;

public class cekBilanganPrima{
    public static void main (String [] Args){
        int y;
        boolean test = true;

        Scanner scanner = new Scanner(System.in);
        System.out.println("Bilangan yang ingin dicek: ");
        int x = scanner.nextInt();

            if (x < 2) {
            test = false; // 1 bukan prima
        }
        else if (x == 2) {
            test = true; // 2 adalah bilangan prima
        }
        else  {
            y = (int) Math.sqrt(x);
            while (test && y >= 2) {
                if (x % y == 0) {
                    test = false;
                    break;
                }
                y = y-1;
             }
             } 
            if (test) {
                System.out.println(x + " Bilangan Prima");
            }
            else {
                System.out.println(x + " Bukan Bilangan Prima");
            }
            scanner.close();
        }
}   
