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
   //pjManager.schedulework();
   
   public static ProductManager pdManager = new ProductManager();

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

      // worker testing
      worker.work();
      worker.eat();
      worker.sick();

      // superworker testing
      superworker.work();
      superworker.eat();
      superworker.sick();

      // tempworker testing
      tempworker.work();
      tempworker.eat();
      tempworker.sick();

      // robot testing
      robot.work();
      robot.reboot();
      
      try 
      {
         System.out.format("Stopping ... \n");               
      } 
      catch (Exception main_except)
      {
         main_except.printStackTrace();
      }
	  
	  pjManager.schedulework();
	  pdManager.defineproduct();
      System.exit(0);

   }
}