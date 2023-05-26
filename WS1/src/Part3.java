/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.*;


/**
 *
 * @author Admin
 */
public class Part3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String[] list=new String[10];
        for (int i=0; i<list.length;i++) {
            
            list[i]=sc.nextLine();
    }
        for (int i=0; i<list.length; i++) {
            String upperCase = list[i].substring(0,1).toUpperCase();
            String lowerCase = list[i].substring(1).toLowerCase();
            list[i] = upperCase + lowerCase;
            System.out.println(list[i]);
        }     
}
}
