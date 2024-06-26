package com.oops;

public class MotorBikeRunner {
    public static void main(String[] args) {
        MotorBike ducati = new MotorBike(100);
        MotorBike honda = new MotorBike(200);

        ducati.start();
        honda.start();

        ducati.increaseSpeed(100);
        ducati.decreaseSpeed(100);

        honda.increaseSpeed(100);
        honda.decreaseSpeed(50);
    }
}
