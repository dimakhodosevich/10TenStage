package by.itstep.khodosevich.tenproject.task06.controller;

import by.itstep.khodosevich.tenproject.task06.view.Printer;

import java.util.Scanner;

import static by.itstep.khodosevich.tenproject.task06.module.logic.ParityNumber.*;

public class ControllerParityNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input your value in console (natural numbers starts from 1): ");
        double number = scanner.nextDouble();
        String msg = String.format("All numbers in your value is parity?" +
                "\nAnswer: %b.", checkParityNumber(number));
        Printer.print(msg);

        scanner.close();
    }
}
