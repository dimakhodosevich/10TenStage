package by.itstep.khodosevich.tenproject.task03.module.logic;

public class AscendDescendNumber {

    public static String errorMessage;

    static {
        errorMessage = "Your value is lower then 9!!!\n";
    }

    private AscendDescendNumber() {

    }

    public static boolean checkAscendDescendNumber(double number) {
        int numberInt = (int) number;

        if (numberInt <= 9) {
            System.err.print(errorMessage);
            throw new RuntimeException();
        }

        boolean isAscendValue = checkAscendNumber(numberInt);
        boolean isDescendValue = checkDescendNumber(numberInt);

        if (isAscendValue) {
            return isAscendValue;
        } else if (isDescendValue) {
            return isDescendValue;
        }

        boolean isNotAscendAndDescend = isAscendValue;

        return isNotAscendAndDescend;
    }

    private static boolean checkAscendNumber(double number) {
        int numberInt = (int) number;

        if (numberInt <= 9) {
            System.err.print(errorMessage);
            throw new RuntimeException();
        }

        boolean isAscend = true;

        int lastNumber = numberInt % 10;
        numberInt /= 10;

        while (numberInt > 0) {
            int previousNumber = numberInt % 10;
            numberInt /= 10;

            if (lastNumber <= previousNumber) {
                return !isAscend;
            }
            lastNumber = previousNumber;
        }

        return isAscend;
    }

    private static boolean checkDescendNumber(double number) {
        int numberInt = (int) number;

        if (numberInt <= 9) {
            System.err.print(errorMessage);
            throw new RuntimeException();
        }

        boolean isDescend = true;

        int lastNumber = numberInt % 10;
        numberInt /= 10;

        while (numberInt > 0) {
            int previousNumber = numberInt % 10;
            numberInt /= 10;

            if (lastNumber >= previousNumber) {
                return !isDescend;
            }
            lastNumber = previousNumber;
        }

        return isDescend;
    }

}
