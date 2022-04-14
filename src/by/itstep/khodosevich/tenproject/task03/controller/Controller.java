package by.itstep.khodosevich.tenproject.task03.controller;

import by.itstep.khodosevich.tenproject.task03.view.Printer;

import java.util.Scanner;

import static by.itstep.khodosevich.tenproject.task03.module.logic.AscendDescendNumber.*;

public class Controller {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input your value in console: ");
        double number = scanner.nextDouble();
        String msg = String.format("Your value is ascend or descend?" +
                "\nAnswer: %b.", checkAscendDescendNumber(number));
        Printer.print(msg);

        scanner.close();
    }
}

