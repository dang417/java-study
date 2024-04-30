package com.BiNumber;

public class BiNumber {
    private int number1;
    private int number2;

    public BiNumber(int number1, int number2) {
        this.number1 = number1;
        this.number2 = number2;
    }

    int add() {
        return this.number1+this.number2;
    }

    int multiply() {
        return this.number1 * this.number2;
    }

    void doubleValue() {
        this.number1 = this.number1 * 2;
        this.number2 = this.number2 * 2;
    }

    int getNumber1() {
        return this.number1;
    }

    int getNumber2() {
        return this.number2;
    }
}
