package by.itstep.khodosevich.tenproject.task04.module.logic;

public class Palindrome {

    public static final String errorMessage;

    static {
        errorMessage = "Your value is negative!!!\n";
    }

    private Palindrome() {
    }

    public static boolean checkPalindrome(double number) {
        int numberInt = (int) number;

        if (number < 0) {
            System.err.print(errorMessage);
            throw new RuntimeException();
        }

        int tempIntNumber = numberInt;

        int reverseNumber = 0;
        boolean result = true;

        while (numberInt > 0) {

            int lastNumber = numberInt % 10;
            numberInt /= 10;
            reverseNumber = reverseNumber * 10 + lastNumber;
        }

        if (reverseNumber == tempIntNumber) {
            return result;
        }

        return !result;
    }

}
