package by.itstep.khodosevich.tenproject.task02.controller;

import by.itstep.khodosevich.tenproject.task02.view.Printer;

import java.util.Scanner;

import static by.itstep.khodosevich.tenproject.task02.module.logic.SameOneNumber.*;

public class ControllerSameOneNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input your value in console: ");
        double number = scanner.nextDouble();
        String msg = String.format("Your value has any same number?" +
                "\nAnswer: %b", checkTheSameOneNumber(number));
        Printer.print(msg);

        scanner.close();
    }
}
