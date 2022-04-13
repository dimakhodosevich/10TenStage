package by.itstep.khodosevich.tenproject.task01.module.logic;

public final class SameValue {

    private static String error;
    private static final int MAX_VALUE_WITH_ONE_NUMBER;

    static {
        MAX_VALUE_WITH_ONE_NUMBER = 9;
        error = "Your value has one number!!!\n";
    }

    private SameValue() {

    }

    public static boolean checkTheSameValue(double number) {

        int numberInt = (int) number;
        boolean result = true;
        numberInt = numberInt > 0 ? numberInt : -numberInt;

        if (numberInt <= MAX_VALUE_WITH_ONE_NUMBER) {
            System.err.print(error);
            throw new RuntimeException();
        }

        int last_number = numberInt % 10;
        numberInt /= 10;

        while (numberInt > 0) {
            int previous_number = numberInt % 10;
            numberInt /= 10;
            if (last_number != previous_number) {
                return !result;
            }
            last_number = previous_number;
        }

        return true;
    }

}
