package by.itstep.khodosevich.tenproject.task07.controller;

import by.itstep.khodosevich.tenproject.task07.view.Printer;

import java.util.Scanner;

import static by.itstep.khodosevich.tenproject.task07.module.logic.NonParityNumber.*;

public class ControllerNonParityNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input your value in console (natural numbers starts from 1): ");
        double number = scanner.nextDouble();
        String msg = String.format("All numbers in your value is not parity?" +
                "\nAnswer: %b.", checkNonParityNumber(number));
        Printer.print(msg);

        scanner.close();
    }
}
