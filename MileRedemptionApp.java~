/************************************************************
 *                                                          *
 *  CSCI 470-1/502-1    Assignment-2    Spring 2019         *
 *                                                          *
 *  Programmer:  Sai Kiran Vunnam (Z1840993)                *
 *               Gopica Sahiti Damineni (Z1840906)          *   
 *                                                          *
 *  Date Due:     02/20/2019                                *
 *                                                          *
 * Console-based Java application with which a travel agent *
 * could present options for travel destinations to a client*
 * who wants to redeem his or her accumulated frequent flyer*
 * miles                                                    *
 ************************************************************/ 




/*MileRedemptionApp Class have the main method to print the 
 * entire output,we use a scanner object to read the destination
 * record in the file and prints the destination list, It prompts 
 * the user to give the Frequent flyer miles and Month\*/

import java.io.FileNotFoundException;
import java.util.Scanner;

public class MileRedemptionApp {

 public static void main(String[] args) throws FileNotFoundException {
  

  Scanner scan = new Scanner(System.in);
  
  System.out.println("Please Enter the name of the file: \n");
  
 
  MileRedeemer mileRedemer = new MileRedeemer();
  
  
  mileRedemer.readDestinations(scan);
  
  System.out.println("\n----------------------------------------------------------------");
  System.out.println("WELCOME TO THE JAVA AIRLINES FREQUENT FLYER MILES REDEMPTION APP");
  System.out.println("-----------------------------------------------------------------\n");
  
  System.out.println("List of destination cities your client can travel to:\n");
 
  String[] destinationCity = mileRedemer.getCityNames();
   
  
  for (int i = 0; i < destinationCity.length; i++) {
   System.out.println(destinationCity[i]);
  }
  
  System.out.println("\n----------------------------------------------------------------");
  
  while(true) {
   System.out.println("\nPlease enter your client's accumulated Frequent Flyer Miles:\n");
   


   int miles = scan.nextInt();
   System.out.println("\nPlease enter your client's month of departure (1-12):\n");
   
 
   int month = scan.nextInt();
  

   String[] Result = mileRedemer.redeemMiles(miles, month);
   

   if(Result.length!=0) {
    System.out.println("\nYour client's Frequent Flyer Miles can be used to redeem the following tickets:\n");
    for( String i : Result ) {
    System.out.println(i);
       }
   }else {
    
    System.out.println("\n*** Your client has not accumulated enough Frequent Flyer Miles ***\n");
   }
   
   System.out.println("\nYour client's remaining Frequent Flyer Miles:" + mileRedemer.getRemainingMiles());
   System.out.println("\n----------------------------------------------------------------\n");
   System.out.println("Do you want to continue (y/n)? ");
   String input = scan.next();
   
   System.out.println("\n----------------------------------------------------------------");
   
 
   if(!input.equalsIgnoreCase("y")) {
    
    System.out.println("\n-------------------------------------------------------------------------");
    System.out.println("THANK YOU FOR USING THE JAVA AIRLINES FREQUENT FLYER MILES REDEMPTION APP");
    System.out.println("-------------------------------------------------------------------------");
    break; 
   }
   }
  scan.close();
   }
 } 
