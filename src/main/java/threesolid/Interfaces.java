package threesolid;

/*
Author: Zak King

This document is adhering to all three of the SOLID principals.
1. It follows the open closed principal because all the interfaces are seperated from the other classes in a single document, this way the interfaces can be extended without bothering the other classes. 
	
2. This document also follows the single responsibility and interface segregation for the same reasons, It splits up the two tasks of eating and working into two inferfaces  IWorkable and IFeedable. 
*/

interface IWorkable {
	public void work();
}   

interface IEat {
	public String eat();
}  

interface ISick {
	public void sick();
}  

interface IReboot {
	public void reboot();
}  
