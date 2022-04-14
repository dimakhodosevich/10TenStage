package by.itstep.khodosevich.tenproject.task08.controller;

import by.itstep.khodosevich.tenproject.task08.view.Printer;

import java.util.Scanner;

import static by.itstep.khodosevich.tenproject.task08.module.logic.ParityCounter.*;


public class ControllerParityCounter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input your value in console (natural numbers starts from 1): ");
        double number = scanner.nextDouble();
        String msg = String.format("Your value consist from %d parity numbers.", countParityNumber(number));
        Printer.print(msg);

        scanner.close();
    }
}
