package by.itstep.khodosevich.tenproject.task02.module.logic;


public final class SameOneNumber {

    public static String messageError;
    public static final int MAX_VALUE_WITH_ONE_NUMBER = 9;

    static {
        messageError = "Your value has one number!!!\n";
    }

    private SameOneNumber() {
    }

    public static boolean checkTheSameOneNumber(double number) {
        int numberInt = (int) number;

        numberInt = numberInt > 0 ? numberInt : -numberInt;

        if (numberInt <= MAX_VALUE_WITH_ONE_NUMBER) {
            System.err.print(messageError);
            throw new RuntimeException();
        }

        boolean result = false;

        while (numberInt > 0) {

            int tempNumberInt = numberInt;
            int lastNumber = tempNumberInt % 10;
            tempNumberInt = tempNumberInt / 10;

            while (tempNumberInt > 0) {

                int previousNumber = tempNumberInt % 10;
                tempNumberInt /= 10;

                if (previousNumber == lastNumber) {
                    return !result;
                }
            }

            numberInt = numberInt / 10;
        }

        return result;
    }
}
