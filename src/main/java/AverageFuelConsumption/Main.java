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
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Vehicle v = new Vehicle();

        v.refuel(35.0);
        v.driveAroundTown(3.0);
        v.outdoorDriving(80.0);
        //   System.out.println("Average consumption so far off last refuel is " + v.averageConsupmtionOffLastRefuel());

        v.driveAroundTown(5.6);
        v.driveAroundTown(1.2);
        //  System.out.println("Average consumption so far off last refuel is " + v.averageConsupmtionOffLastRefuel());
        v.refuel(5.0);
        v.driveAroundTown(5.0);
        v.driveAroundTown(1.5);

        v.refuel(5.0);

        System.out.println("End!");

    }

}
