package com.ravature.HW1Calculator;

import java.util.Scanner;

/*I wrote this code to include as many OOPs as possible and I apologize in advance for over complication*/

interface calculations{
    int Add(int i, int j);
    int Subtract(int i, int j);
    int Multiply(int i, int j);
    int Divide(int i, int j);
}//opertions interfaces

class getnumbers{
    protected int firstExponent;
    protected int secondExponent;
    boolean ran = false;
    Scanner Inputs = new Scanner(System.in);
    public getnumbers(){
        getNumbers();
    }
    public void getNumbers(){
        System.out.print("Please enter Numbers to calculate" + "\nFirst Number: ");
        firstExponent = Inputs.nextInt();
        System.out.print("\nSecond number: ");
        secondExponent = Inputs.nextInt();
    }
}//includes funciton for getting numbers
class calculate extends getnumbers implements calculations{
    private int solution;
    private int operation;
    Scanner calculation = new Scanner(System.in);
    public calculate(){
        operation = 10;
        while (operation > 5 || operation < 5) {
            if (ran) {
                getNumbers();
            }
            else
                ran = true;
            System.out.println("Please enter the Operation you wold like to perform: \n1(Additon)\t2(Subtraction)\t3(Multiplication)\t4(Division)\t5(Quit)");
            operation =calculation.nextInt();
            switch (operation) {
                case 1:
                    System.out.println("Answer : " + Add(super.firstExponent, super.secondExponent));
                    solution = 0;
                    break;
                case 2:
                    System.out.println("Answer : " + Subtract(super.firstExponent, super.secondExponent));
                    solution = 0;
                    break;
                case 3:
                    System.out.println("Answer : " + Multiply(super.firstExponent, super.secondExponent));
                    solution = 0;
                    break;
                case 4:
                    System.out.println("Answer : " + Divide(super.firstExponent, super.secondExponent));
                    solution = 0;
                    break;
                case 5:
                    System.out.println("Quitting calculator");
                    break;
            }
            if (operation < 1 || operation > 5) {
                System.out.println("invalid input please try again: ");
                operation = 10;
            }
        }
    }//continues to call for numbers until user inputs 5 operation to quit
//    public calculate(int firstNumber, int secondNumber, int operation){
//        switch (operation){
//            case 1:
//                System.out.println("Result: " + Add(firstNumber, secondNumber));
//                break;
//            case 2:
//                System.out.println("Result: " + Subtract(firstNumber, secondNumber));
//                break;
//            case 3:
//                System.out.println("Result: " + Multiply(firstNumber, secondNumber));
//                break;
//            case 4:
//                System.out.println("Result: " + Divide(firstNumber, secondNumber));
//                break;
//        }
//    }

    @Override
    public int Add(int i, int j) {
        solution = i + j;
        firstExponent = 0;
        secondExponent = 0;
        return solution;
    }

    @Override
    public int Subtract(int i, int j) {
        solution = i - j;
        firstExponent = 0;
        secondExponent = 0;
        return solution;
    }

    @Override
    public int Multiply(int i, int j) {
        solution = i * j;
        firstExponent = 0;
        secondExponent = 0;
        return solution;
    }

    @Override
    public int Divide(int i, int j) {
        solution = i / j;
        firstExponent = 0;
        secondExponent = 0;
        return solution;
    }
}

public class ExCalculator {
    public static void main(String[] args) {
        //calculate calculateWithout = new calculate(3,4,3);
        calculate calculateWithPrompt = new calculate();
    }

}
