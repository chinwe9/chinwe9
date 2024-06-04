
package com.mycompany.bodymassindex;
import java.util.Scanner;
public class BodyMassIndex {

    public static void main(String[] args) {
        // create a scanner
       Scanner weight  = new Scanner(System.in); 
       Scanner height = new Scanner(System.in);
       
       double w ;
       double h ;
       
       //Enter your weight in kilograms
       System.out.print("Enter your weight in kilograms: ");
       w = weight.nextDouble();
       
       //Enter your height in meters
       System.out.print("Enter your height in meters: ");
       h = height.nextDouble();
       
       //height =0.0 & weight =0.0
           System.out.println("***************************");   
        var bmi = w/ (h*h);
       
        
        System.out.println("BMI value:"+ bmi);
        
        if(bmi<18.5);
           //BMI value is less than 18.5
           System.out.println("you are underweight");
           
       
       if(bmi<=18.5 & bmi<25.0)
           //BMI value is between 18.5 and 25.0
           System.out.println(" you are normal");
          
           
       if(bmi<=25.0 & bmi<=30.0)
           //BMI value is between 25.0 and 30.0.
           System.out.println(" you are overweight");
          
     
       if(bmi>=30.0)
          //BMI value is 30.0 and above
       System.out.println(" you are obese");

       
      
       
 
       
       
       
       
    }
}
