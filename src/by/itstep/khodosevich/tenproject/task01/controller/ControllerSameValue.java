package by.itstep.khodosevich.tenproject.task01.controller;

import by.itstep.khodosevich.tenproject.task01.view.Printer;

import java.util.Scanner;

import static by.itstep.khodosevich.tenproject.task01.module.logic.SameValue.*;

public class ControllerSameValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input your value in console: ");
        double number = scanner.nextDouble();
        String msg = String.format("Your value consist from the same numbers?" +
                "\nAnswer: %b", checkTheSameValue(number));
        Printer.print(msg);

        scanner.close();
    }
}
