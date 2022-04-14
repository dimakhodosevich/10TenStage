package by.itstep.khodosevich.tenproject.task05.controller;

import static by.itstep.khodosevich.tenproject.task05.module.BankPercent.*;

import by.itstep.khodosevich.tenproject.task05.view.Printer;

import java.util.Scanner;

public class ControllerBankPercent {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input your deposit value \"$\": ");
        double deposit = scanner.nextDouble();
        Printer.print("Input your percent value: ");
        double percent = scanner.nextDouble();
        Printer.print("Input your period in mount value: ");
        double mount = scanner.nextDouble();

        String msg = String.format("Your cash will be %.2f$.",
                calculateBankCash(deposit, percent, mount));
        Printer.print(msg);

        scanner.close();
    }
}
