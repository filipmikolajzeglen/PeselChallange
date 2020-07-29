package en.filipzeglen.pesel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Enter your PESEL number: ");
        String enterNrPesel = scanner.next();

        Pesel pesel = new Pesel(enterNrPesel);
        pesel.checkPesel(enterNrPesel);
    }

}
