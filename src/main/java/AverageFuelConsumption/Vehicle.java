/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AverageFuelConsumption;

/**
 *
 * @author FahirL
 */
public class Vehicle {

    private double tank = 0.0;   //rezervoar
    private double transitMileage = 0.0; // predjena kilometraza

    private double transitMileageLastRefuel = 0.0;  // predjena kilometraza kod posljednje dopune
    private double statusTankOffLastRefuel = 0.0;  // stanje rezervoara kod posljednje dopune
    private double amountLastRefuel = 0.0;  // iznos posljednje dopune

    public double getTank() {
        return tank;
    }

    public double getTransitMileage() {
        return transitMileage;
    }

    public void refuel(double amount) {
        System.out.println("So far is average consumption was "+ this.averageConsupmtionOffLastRefuel());
        statusTankOffLastRefuel = tank;
        transitMileageLastRefuel = transitMileage;
        tank += amount;
        amountLastRefuel = amount;

    }

    public void driveAroundTown(double road) {
        transitMileage += road;
        tank -= (road / 100.) * 7.0;

    }

    public void outdoorDriving(double road) {
        transitMileage += road;
        tank -= (road / 100.) * 5.6;

    }

    public double averageConsupmtionOffLastRefuel() {
        double transitRoad, spendFuel;

        transitRoad = transitMileage - transitMileageLastRefuel;
        spendFuel = (statusTankOffLastRefuel + amountLastRefuel) - tank;

        return (spendFuel * 100.0) / transitRoad;

    }

}
