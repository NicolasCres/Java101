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
public class Application
{

	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args)
	{
		areYouOlderThan18();
		//GreaterthanExample();
		//MathGuessexample(args);

	}

	public static void GreaterthanExample()

	{
	}

	public static void areYouOlderThan18()
	{
		String ageInput = JOptionPane.showInputDialog("What age are you?");
		int age = Integer.parseInt(ageInput);
		if (age > 18)
		{
			System.out.println("you can vote");
		} else if (age == 18)
		{
			System.out.println("get a job");
		} else if (age == 12)
		{
			System.out.println("go to school and study");
		} else
		{
			System.out.println("go back to coder dojo");
		}

		if (age < 18 && age == 12)
		{
			System.out.println("last year as a child");
		}
		if (age < 18)
		{
			System.out.println("you are teenager");
		
		}

	

	public static void MathGuessexample(String[] args)
	{
		String input = JOptionPane.showInputDialog("enter your name ");
		System.out.println(input);
		String name = "Nicolas";
		int number1 = 654;
		int number2 = 5987;

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
