package by.itstep.khodosevich.tenproject.task10.module.logic;

public class NumberCounter {

    private static final String ERROR_MESSAGE_VALUE;
    private static final String ERROR_MESSAGE_SEARCH_NUMBER;


    static {
        ERROR_MESSAGE_VALUE = "Your value lower than 1.\n";
        ERROR_MESSAGE_SEARCH_NUMBER = "Your search number lower than 0.\n";
    }

    private NumberCounter() {

    }

    public static int countNumberInValue(double value, int searchNumber) {

        int valueInt = (int) value;

        if (valueInt < 1) {
            System.err.print(ERROR_MESSAGE_VALUE);
            throw new RuntimeException();
        }

        if (searchNumber < 0) {
            System.err.print(ERROR_MESSAGE_SEARCH_NUMBER);
            throw new RuntimeException();
        }

        int counter = 0;

        while (valueInt > 0) {
            int lastNumber = valueInt % 10;
            valueInt /= 10;

            if (lastNumber == searchNumber) {
                counter++;
            }
        }
        return counter;
    }
}
