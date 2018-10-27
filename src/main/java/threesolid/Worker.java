/*
    Author: Alex Muyshondt
	
	-The worker class benefits from the Interface Segregation Principle as it 
	 implements both the IWorkable and IFeedable interfaces, 
	 which are necessary for the class. 
	-The Single Responsibility Principle did not apply as it did not need to be 
	 broken up into separate classes.
	-The Open Close Principle did apply as it is written in a way that allows 
	 for simple extension, without having to edit the existing code.
*/

package threesolid;

public class Worker extends BaseWorker implements IEat, ISick {

   public Worker() {
   }

   public String eat(){
       return("Worker is eating..."); 
   }

   public String sick(){
	   return("Worker is sick...");
   }
}
