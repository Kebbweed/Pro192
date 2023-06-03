/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Part3;

/**
 *
 * @author Admin
 */
public class Guitar {
    private String serialNumber;
    private int price;
    private String builder;
    private String model;
    private String backWood;
    private String topWood;
    public Guitar(){};
    public Guitar(String serialNumber, int price, String builder, String model, String backWood, String topWood){
        this.serialNumber = serialNumber;
        this.price = price;
        this.builder = builder;
        this.model = model;
        this.backWood = backWood;
        this.topWood = topWood;
    }
    public String getSerialNumber(){
        return this.serialNumber;
    }
    public void setSerialNumber(String serialNumber){
        this.serialNumber = serialNumber;
    }
    public int getPrice(){
        return this.price;
    }
    public void setPrice(int price){
        this.price = price;
    }
    public String getBuilder(){
        return this.builder;
    }
    public void setBuilder(String builder){
        this.builder = builder;
    }
    public String getModel(){
        return this.model;
    }
    public void setModel(String model){
        this.model = model;
    }
    public String getBackWood(){
        return this.model;
    }
    public void setBackWood(String backWood){
        this.backWood = backWood;
    }
    public String getTopWood(){
        return this.topWood;
    }
    public void settopWood(String topWood){
        this.topWood = topWood;
    }
    public void createSound(){
        getSerialNumber();
        getPrice();
        getBuilder();
        getModel();
        getBackWood();
        getTopWood();
        System.out.println("serialNumber: " + this.serialNumber);
        System.out.println("price: " + this.price);
        System.out.println("builder: " + this.builder);
        System.out.println("model: " + this.model);
        System.out.println("backWood: " + this.backWood);
        System.out.println("topWood: " + this.topWood);
    }
}
