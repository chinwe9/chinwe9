
package com.mycompany.computingtax;

import java.util.Scanner;

public class ComputingTax {

    public static void main(String[] args) {
        //create a scanner
    Scanner input = new Scanner(System.in);
    
    
            
    //prompt the user to enter filling status
    System.out.print("(0-single filler, 1-married jointly, 2-married separately, 3-head of household) Enter the fillin status:");
     int status = (int) input.nextDouble();
    
    //prompt the user to enter taxable income
    System.out.print("Enter the taxable income:");
        var income = input.nextDouble();
        
        //compute tax
        
    double tax =0;
        if (status==0){
            //compute tax for single fillers
            if (income <= 8350)
            tax = income* 0.10;
        
            if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350)* 0.15;
            
            if (income <= 82250)
                 tax = 8350 * 0.10 + (33950 - 8350)* 0.15 + (income - 33950)*0.25;
            
            if (income <= 171550)
                tax = 8350 * 0.10 + (33950 - 8350)* 0.15 + (82250 - 33950) * 0.25 + (income - 82250)* 0.28;
            
               if (income <= 372950)
                tax = 8350 * 0.10 + (33950 - 8350)* 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (income - 171550) * 0.33;
               
                if (income <= 372951)
                tax = 8350 * 0.10 + (33950 - 8350)* 0.15 + (82250 - 33950) * 0.25 + (171550 - 82250) * 0.28 + (372950 - 171550) * 0.33 + (income - 372950) * 0.35;
               
               }
        
         if (status==1){
             //compute tax for married jointly fillers
            if (income <= 16700)
            tax = income* 0.10;
        
            if (income <= 67900)
                tax = 16700 * 0.10 + (income - 16700)* 0.15;
            
            if (income <= 137050)
                 tax = 16700 * 0.10 + (67900 - 16700)* 0.15 + (income - 67900)*0.25;
            
            if (income <= 208850)
                tax = 16700 * 0.10 + (67900 - 16700)* 0.15 + (137050 - 67900) * 0.25 + (income - 137050)* 0.28;
            
               if (income <= 372950)
                tax = 16700 * 0.10 + (67900 - 16700)* 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (income - 208850) * 0.33;
               
                if (income <= 372951)
                tax = 16700 * 0.10 + (67900 - 16700)* 0.15 + (137050 - 67900) * 0.25 + (208850 - 137050) * 0.28 + (372950 - 208850) * 0.33 + (income - 372950) * 0.35;
               
               }
    
     if (status==2){
     //compute tax for married separately fillers
            if (income <= 8350)
            tax = income* 0.10;
        
            if (income <= 33950)
                tax = 8350 * 0.10 + (income - 8350)* 0.15;
            
            if (income <= 68525)
                 tax = 8350 * 0.10 + (33950 - 8350)* 0.15 + (income - 33950)*0.25;
            
            if (income <= 104425)
                tax = 8350 * 0.10 + (33950 - 8350)* 0.15 + (68525 - 33950) * 0.25 + (income - 68525)* 0.28;
            
               if (income <= 186475)
                tax = 8350 * 0.10 + (33950 - 8350)* 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (income - 104425) * 0.33;
               
                if (income <= 186476)
                tax = 8350 * 0.10 + (33950 - 8350)* 0.15 + (68525 - 33950) * 0.25 + (104425 - 68525) * 0.28 + (186475 - 104425) * 0.33 + (income - 186475) * 0.35;
               
               }
     
       if (status==3){
            //compute tax for Head of household fillers
            if (income <= 11950)
            tax = income* 0.10;
        
            if (income <= 45500)
                tax = 11950 * 0.10 + (income - 11950)* 0.15;
            
            if (income <= 117450)
                 tax = 11950 * 0.10 + (45500 - 11950)* 0.15 + (income - 45500)*0.25;
            
            if (income <= 190200)
                tax = 11950 * 0.10 + (45500 - 11950)* 0.15 + (117450 - 45500) * 0.25 + (income - 117450)* 0.28;
            
               if (income <= 372950)
                tax = 11950 * 0.10 + (45500 - 11950)* 0.15 + (117450 - 45500) * 0.25 + (171550 - 11740) * 0.28 + (income - 190200) * 0.33;
               
                if (income <= 372951)
                tax = 11950 * 0.10 + (45500 - 11950)* 0.15 + (117450 - 45500) * 0.25 + (171550 - 117450) * 0.28 + (372950 - 190200) * 0.33 + (income - 372950) * 0.35;
               
               }
       //Display result
       System.out.println("the tax is:" + "$" + (int)(tax * 100)/ 100.0);
        }

   
               
   
    }

