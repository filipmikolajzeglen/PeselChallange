package pl.filipzeglen.pesel;

public class Pesel {

    private String nrPesel;
    private int resultOfMultiplication;
    private int indexOfThePeselNumber = 0;

    // CONSTRUCOTR
    Pesel(String enterNrPesel)
    {
        this.nrPesel = enterNrPesel;
    }

    // GETTER AND SETTER
    public String getNrPesel() { return nrPesel; }
    public void setNrPesel(String nrPesel) { this.nrPesel = nrPesel; }

    // THIS IS A METHOD WHICH CHECKS A PESEL NUMBER. IT WORKS BY PARSE TEXT TO INTEGER VALUE AND NEXT MAKING THE NECESSARY
    // CALCULATIONS TO VERIFY CORRECTNESS OF PESEL NUMBER. IF THE LAST DIGIT OF RESULT IS 0 THEN PESEL NUMBER IS CORRECT
    public void checkPesel(String nrPesel) {
        while (indexOfThePeselNumber < nrPesel.length()) {

            for(; indexOfThePeselNumber < nrPesel.length(); indexOfThePeselNumber++) {
                char split = nrPesel.charAt(indexOfThePeselNumber);
                int digit = Integer.parseInt(String.valueOf(split));

                if(indexOfThePeselNumber == 0 || indexOfThePeselNumber == 4 || indexOfThePeselNumber == 8 || indexOfThePeselNumber == 10) {
                    resultOfMultiplication += multiplication(digit, 1);
                }
                else if(indexOfThePeselNumber == 1 || indexOfThePeselNumber == 5 || indexOfThePeselNumber == 9) {
                    resultOfMultiplication += multiplication(digit, 3);
                }
                else if(indexOfThePeselNumber == 2 || indexOfThePeselNumber == 6) {
                    resultOfMultiplication += multiplication(digit, 7);
                }
                else if(indexOfThePeselNumber == 3 || indexOfThePeselNumber == 7) {
                    resultOfMultiplication += multiplication(digit, 9);
                }
            }

            if(resultOfMultiplication % 10 == 0) {
                System.out.println(" NR PESEL JEST PRAWIDŁOWY");
            }
            else {
                System.out.println(" NR PESEL JEST NIEPRAWIDŁOWY");
            }
        }
    }

    // SIMPLE METHOD TO MULTIPLICATION
    public int multiplication(int numberToMultiplication, int multiplicationBy) {
        int result = numberToMultiplication * multiplicationBy;
        return result;
    }
}