/*
    Author: Andrew Hyatt
	- By separating the ThreeSolidMain class:
	    1) We respect the Single Responsibility Principle because the only function of this class is to 
	       run the program. This reduces the reasons to change this code significantly, since the only
	       need to change any code is based on how we want to run the program.
	    2) We don't adhere to the Open Close principle since we may change algorithms 
	       for the best approach in running the program.
	    3) We also don't adhere to the Interface Segregation Principle since there are no interfaces 
	       declared or implemented in this class.
*/

package threesolid;

import java.awt.*;        // Using AWT container and component classes
import java.awt.event.*;  // Using AWT event classes and listener interfaces
import java.io.*;

public class ThreeSolidMain
{   

   public static Manager tsManager = new Manager();
   public static ProjectManager pjManager = new ProjectManager(); 
   public static ProductManager pdManager = new ProductManager();
   public static BaseWorker baseworker = new BaseWorker();
   public static Worker worker = new Worker();
   public static SuperWorker superworker = new SuperWorker();
   public static TempWorker tempworker = new TempWorker();
   public static Robot robot = new Robot();
   

   // The entry main() method
   public static void main(String[] args) 
   {
 
      try 
      {
         System.out.format("Starting ... \n");               
      } 
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }

	  // baseworker testing
	  System.out.println("\nTesting BaseWorker class: ");
      baseworker.work();
	  
      // worker testing
      System.out.println("\nTesting Worker class: ");
      worker.work();
      worker.eat();
      worker.sick();

      // superworker testing
      System.out.println("\nTesting SuperWorker class: ");
      superworker.work();
      superworker.eat();
      superworker.sick();

      // tempworker testing
      System.out.println("\nTesting TempWorker class: ");
      tempworker.work();
      tempworker.eat();
      tempworker.sick();

      // robot testing
      System.out.println("\nTesting Robot class: ");
      robot.work();
      robot.reboot();

	  // Manager testing
      System.out.println("\nTesting Manager class: ");
      tsManager.manage();
	  
      // ProjectManager testing
      System.out.println("\nTesting ProjectManager class: ");
      pjManager.schedulework();
      pjManager.manage();
      
      // ProductManager testing
      System.out.println("\nTesting ProductManager class: ");
	  pdManager.defineproduct();
      pdManager.manage();

      try 
      {
         System.out.format("\nStopping ... \n");               
      } 
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }
	  
      System.exit(0);

   }
}