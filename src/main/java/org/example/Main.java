package org.example;

import org.example.company.*;
import org.example.arge.*;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(8, "Base car");
        System.out.println(car.startEngine());
        System.out.println(car.accelerate());
        System.out.println(car.brake());

        Car mitsubishi = new Mitsubishi(6, "Outlander VRX 4WD");
        System.out.println(mitsubishi.startEngine());
        System.out.println(mitsubishi.accelerate());
        System.out.println(mitsubishi.brake());

        Car ford = new Ford(6, "Ford Falcon");
        System.out.println(ford.startEngine());
        System.out.println(ford.accelerate());
        System.out.println(ford.brake());

        Car holden = new Holden(6, "Holden Commodore");
        System.out.println(holden.startEngine());
        System.out.println(holden.accelerate());
        System.out.println(holden.brake());

        System.out.println("\nCar R&D Company");

        CarSkeleton gas = new GasPoweredCar("Gas Car", "Benzinli", 12.5, 6);
        CarSkeleton electric = new ElectricCar("Electric Car", "Elektrikli", 400.0, 75);
        CarSkeleton hybrid = new HybridCar("Hybrid Car", "Hibrit", 18.0, 40, 4);

        gas.startEngine();
        gas.drive();

        electric.startEngine();
        electric.drive();

        hybrid.startEngine();
        hybrid.drive();
    }
}