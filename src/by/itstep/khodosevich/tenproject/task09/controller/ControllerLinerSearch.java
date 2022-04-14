package by.itstep.khodosevich.tenproject.task09.controller;

import by.itstep.khodosevich.tenproject.task09.view.Printer;

import java.util.Scanner;

import static by.itstep.khodosevich.tenproject.task09.module.logic.LinerSearch.*;

public class ControllerLinerSearch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input your value in console (natural numbers starts from 1): ");
        double number = scanner.nextDouble();
        String msg = String.format("Max number in your value is %d.", getMaxNumber(number));
        Printer.print(msg);

        scanner.close();
    }
}
