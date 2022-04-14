package by.itstep.khodosevich.tenproject.task10.controller;

import by.itstep.khodosevich.tenproject.task09.view.Printer;

import java.util.Scanner;

import static by.itstep.khodosevich.tenproject.task09.module.logic.LinerSearch.getMaxNumber;
import static by.itstep.khodosevich.tenproject.task10.module.logic.NumberCounter.*;
import static by.itstep.khodosevich.tenproject.task10.view.Printer.*;

public class ControllerNumberCounter {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input your value in console (natural numbers starts from 1): ");
        int number = scanner.nextInt();
        Printer.print("Input number which you want count: ");
        int searchNumber = scanner.nextInt();

        String msg = String.format("In your value %d, number %d use %d time(s).",
                number, searchNumber, countNumberInValue(number, searchNumber));
        Printer.print(msg);

        scanner.close();
    }


}
