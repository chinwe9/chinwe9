/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.salestax;

import java.util.Scanner;

/**
 *
 * @author ubahc
 */
public class SalesTax {

    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
       
       System.out.print("enter purchase amount: ");
       double purchaseAmount = input.nextDouble();
       
       double tax = purchaseAmount * 0.06;
       System.out.println("Sales tax is $" + (int)(tax * 100) / 100.0);
    }
}
