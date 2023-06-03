/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part1;

/**
 *
 * @author Admin
 */
public class Car {
    public String Colour;
    public int EnginePower;
    public boolean Convertible;
    public boolean ParkingBrake;
    public Car(){}
    public Car(String Colour, int EnginePower, boolean Convertible, boolean ParkingBrake){
        this.Colour = Colour;
        this.EnginePower = EnginePower;
        this.Convertible = Convertible;
        this.ParkingBrake = ParkingBrake;
    }
    public String getColour(){
        return this.Colour;
    }
    public int getEnginePower(){
        return this.EnginePower;
    }
    public boolean getConvertible(){
        return this.Convertible;
    }
    public boolean getParkingBrake(){
        return this.ParkingBrake;
    }
    public void setColour(String Colour){
        this.Colour = Colour;
    }
    public void setEnginePower(int EnginePower){
        this.EnginePower = EnginePower;
    }
    public void setConvertible(boolean Convertible){
        this.Convertible = Convertible;
    }
    public void setParkingBrake(boolean ParkingBrake){
        this.ParkingBrake = ParkingBrake;
    }
    public void pressStartButton(){
        System.out.println("You have pressed the start button");
    }
    public void pressAcceleratorButton(){
        System.out.println("You have pressed the Accelerator button");
    }
    public void output(){
        System.out.println("Colour: " + this.Colour);
        System.out.println("EnginePower: " + this.EnginePower);
        System.out.println("Convertible: " + this.Convertible);
        System.out.println("ParkingBrake: " + this.ParkingBrake);
    }
}
