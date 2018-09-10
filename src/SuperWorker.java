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

public class SuperWorker implements IWorkable, IFeedable{
	public void work() {
		//.... working much more
	}

	public void eat() {
		//.... eating in launch break
	}
}
