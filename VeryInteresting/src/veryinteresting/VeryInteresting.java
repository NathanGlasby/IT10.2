/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package veryinteresting;

import javax.swing.*;
import java.text.NumberFormat;
import java.util.Locale;

/**
 *
 * @author natha
 */
public class VeryInteresting {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double monthlyInvestment = getPositiveDouble("How much money will you invest each month?");
        double annualInterestRate = getPositiveDouble("What is the annual interest rate percentage?");
        int years = getPositiveInt("For how many years will you invest?");

        double monthlyInterestRate = annualInterestRate / 100 / 12;
        int totalMonths = years * 12;
        double totalInvestment = 0;

        for (int month = 1; month <= totalMonths; month++) {
            totalInvestment += monthlyInvestment;
            totalInvestment += totalInvestment * monthlyInterestRate;
        }

        NumberFormat randFormat = NumberFormat.getCurrencyInstance(Locale.forLanguageTag("en-ZA"));
        String message = "After " + years + " years, your investment will be worth "
                + randFormat.format(totalInvestment) + ".";

        JOptionPane.showMessageDialog(null, message);
        System.out.println(message);
    }

    private static double getPositiveDouble(String prompt) {
        double value = -1;

        while (value <= 0) {
            String input = JOptionPane.showInputDialog(prompt);

            if (input == null) {
                System.exit(0);
            }

            try {
                value = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                value = -1;
            }

            if (value <= 0) {
                JOptionPane.showMessageDialog(null, "Please enter a number greater than 0.");
            }
        }

        return value;
    }

    private static int getPositiveInt(String prompt) {
        int value = -1;

        while (value <= 0) {
            String input = JOptionPane.showInputDialog(prompt);

            if (input == null) {
                System.exit(0);
            }

            try {
                value = Integer.parseInt(input);
            } catch (NumberFormatException e) {
                value = -1;
            }

            if (value <= 0) {
                JOptionPane.showMessageDialog(null, "Please enter a whole number greater than 0.");
            }
        }

        return value;
    }

}
