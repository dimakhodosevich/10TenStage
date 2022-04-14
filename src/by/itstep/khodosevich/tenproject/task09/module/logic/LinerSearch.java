package by.itstep.khodosevich.tenproject.task09.module.logic;

public class LinerSearch {

    private static final String ERROR_MESSAGE;

    static {
        ERROR_MESSAGE = "Your value lower than 1.\n";
    }

    private LinerSearch() {

    }

    public static int getMaxNumber(double number) {
        int numberInt = (int) number;

        if (numberInt < 1) {
            System.err.print(ERROR_MESSAGE);
            throw new RuntimeException();
        }

        int lastNumber = numberInt % 10;
        numberInt /= 10;
        int result = lastNumber;

        while (numberInt > 0) {
            int previousNumber = numberInt % 10;
            numberInt /= 10;

            if (lastNumber < previousNumber) {
                result = previousNumber;
            }
        }

        return result;
    }
}
