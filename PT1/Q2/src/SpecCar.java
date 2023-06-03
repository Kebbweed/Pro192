/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class SpecCar extends Car{
    public int type;
    public SpecCar(){};
    public SpecCar(String maker, int price, int type){
        Car c = new Car();
        c.maker = maker;
        c.price = price;
        this.type = type;
    }
    public String toString(){
        return maker + "," + price + "," + this.type;
    }
    public void setData(){
        setMaker("XZ" + maker);
        price = price + 20;
        System.out.println(maker + "," + price);
    }
    public int getValue(){
        return price + (type < 7 ? 10:15);
    }
}
