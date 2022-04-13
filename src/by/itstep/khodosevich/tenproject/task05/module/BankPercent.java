package by.itstep.khodosevich.tenproject.task05.module;

public class BankPercent {

    private static String errorMessage = "Percent value is't correct!!!\n";


    public static double calculateBankCash(double money, double percent, double mount) {

        if (percent > 25 || percent < 5) {
            System.err.print(errorMessage);
            throw new RuntimeException();
        }

        int mountInt = (int) mount;

        for (int i = 1; i <= mountInt; i++) {
            money += money * percent / 100;
        }

        return money;
    }

}
