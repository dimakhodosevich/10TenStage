package by.itstep.khodosevich.tenproject.task06.module.logic;

public class ParityNumber {

    public static final String ERROR_MESSAGE;

    static {
        ERROR_MESSAGE = "Your value is lower than 1.\n";
    }

    private ParityNumber() {
    }

    public static boolean checkParityNumber(double number) {
        int numberInt = (int) number;

        if (numberInt < 1) {
            System.err.print(ERROR_MESSAGE);
            throw new RuntimeException();
        }

        boolean result = true;

        while (numberInt > 0) {

            int lastNumber = numberInt % 10;
            numberInt /= 10;

            if (lastNumber % 2 != 0) {
                return !result;
            }
        }

        return result;
    }
}
