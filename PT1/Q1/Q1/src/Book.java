/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.Scanner;
/**
 *
 * @author Admin
 */
public class Book {
    private String title;
    private int price;
    
    public Book() {
        // default constructor
    }
    
    public Book(String title, int price) {
        this.title = title;
        this.price = price;
    }
    
    public String getTitle() {
        return title.toUpperCase();
    }
    
    public int getPrice() {
        return price;
    }
    
    public void setPrice(int price) {
        this.price = price;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter title: ");
        String title = scanner.nextLine();
        
        System.out.print("Enter price: ");
        int price = scanner.nextInt();
        
        System.out.println("1. Test getTitle()");
        System.out.println("2. Test setPrice()");
        System.out.print("Enter TC (1 or 2): ");
        int tc = scanner.nextInt();
        
        Book book = new Book(title, price);
        
        switch(tc) {
            case 1:
                System.out.println("OUTPUT:");
                System.out.println(book.getTitle());
                break;
            case 2:
                System.out.print("Enter new price: ");
                int newPrice = scanner.nextInt();
                book.setPrice(newPrice);
                System.out.println("OUTPUT:");
                System.out.println(book.getPrice());
                break;
            default:
                System.out.println("Invalid test case");
                break;
        }
        
        scanner.close();
    }
    
}
