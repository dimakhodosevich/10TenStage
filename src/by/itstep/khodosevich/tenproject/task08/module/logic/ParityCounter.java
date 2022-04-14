package by.itstep.khodosevich.tenproject.task08.module.logic;

public class ParityCounter {

    private static final String ERROR_MESSAGE;

    static {
        ERROR_MESSAGE = "Your value lower than 1.\n";
    }

    private ParityCounter() {

    }

    public static int countParityNumber(double number) {
        int numberInt = (int) number;

        if (numberInt < 1) {
            System.err.print(ERROR_MESSAGE);
            throw new RuntimeException();
        }

        int counter = 0;

        while (numberInt > 0) {
            int last_number = numberInt % 10;
            numberInt /= 10;

            if (last_number % 2 == 0) {
                counter++;
            }
        }

        return counter;
    }
}
