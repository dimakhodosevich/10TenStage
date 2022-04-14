package by.itstep.khodosevich.tenproject.task04.controller;

import by.itstep.khodosevich.tenproject.task04.view.Printer;

import java.util.Scanner;

import static by.itstep.khodosevich.tenproject.task04.module.logic.Palindrome.*;

public class ControllerPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Printer.print("Input your value in console: ");
        double number = scanner.nextDouble();
        String msg = String.format("Your value is palindrome?" +
                "\nAnswer: %b.", checkPalindrome(number));
        Printer.print(msg);

        scanner.close();
    }
}
