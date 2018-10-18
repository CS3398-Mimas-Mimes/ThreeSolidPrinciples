/*
  author: Cuong Le
 */
package threesolid;
/*
 this document is to use all three the solid principles 
 1. this class uses the open close principle becuase it separates from other class and when you are modifying 
    it may not affect other the lass.
 2.this also follows the single responsibility and interface segregation so we just need to modify the methods work() and eat()
   without affect any other classes. 
 */

public class SuperWorker extends BaseWorker implements IEat, ISick {
	@Override
	public void work() {
		System.out.println("SuperWorker is working more...");
	}

	public void eat(){
       System.out.println("SuperWorker is eating...");
   }

   public void sick(){
       System.out.println("SuperWorker is sick...");
   }
}
