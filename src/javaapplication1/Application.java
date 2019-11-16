/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import javax.swing.JOptionPane;

/**
 *
 * @author nigib
 */
public class Application {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String input = JOptionPane.showInputDialog("enter your name ");
        System.out.println(input);
        String name = "gabriel";
        int number1 = 8;
        int number2 = 5;

        int answer = 6 * 85;

        System.out.println(number1 * number2);
        System.out.println(name + answer);
        // TODO code application logic here
        int numberA = 100;
        int numberB = 3;

        int answer01 = numberA * numberB;
        boolean Answer02 = false;

        System.out.println(Answer02);

        int NumberC = 8538;
        int NumberD = 84;

        int Answer03 = NumberC / NumberD;
        int NumberE = 345;
        int NumberF = 654;
//        int answer = NumberE;
    }
}
