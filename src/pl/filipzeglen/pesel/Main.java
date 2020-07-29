package pl.filipzeglen.pesel;

import java.util.Scanner;

public class Main {

    public static void main(String[] args)
    {
        // ENTER THE PESEL NUMBER
        Scanner scanner = new Scanner(System.in);
        System.out.print(" Podaj numer PESEL: ");
        String enterNrPesel = scanner.next();

        Pesel pesel = new Pesel(enterNrPesel);
        pesel.checkPesel(enterNrPesel);
    }

}
