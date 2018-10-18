/*
    Author: Andrew Hyatt
	- By separating the Robot class:
	    1) We respect the Single Responsibility Principle so that only Robots will (potentially) 
	       request changes to this code. Workers and SuperWorkers will not need to change this code, 
	       since it does not apply to Worker and SuperWorker objects.
	    2) We respect the Open Close Principle because this class is written such that changes 
	       won't need to modify the existing code.
	    3) We respect the Interface Segregation Principle because the objects of the Robot class won't 
	       need to implement an interface with extraneous functionality. This means that thus far, 
	       only the IWorkable interface is being implemented.
*/

package threesolid;

public class Robot extends BaseWorker implements IReboot {
	public void reboot(){
		System.out.println("Robot is rebooting...");
	}
}