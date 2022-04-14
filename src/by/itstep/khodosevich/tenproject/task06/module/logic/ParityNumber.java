package by.itstep.khodosevich.tenproject.task06.module.logic;

public class ParityNumber {
    private ParityNumber() {
    }

    public static boolean checkParityNumber(double number) {
        int numberInt = (int) number;
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
