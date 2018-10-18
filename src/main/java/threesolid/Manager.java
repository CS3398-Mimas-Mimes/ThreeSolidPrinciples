package threesolid;
/*
	Danh Pham
*/

//------------------------------------------------------------------------------------------

// The code above is good for IWorker, but now we add new kind of employee called Robot. 
// It is not defined as IWorker. Robot works, but it does not eat. 
// In order to above code works, Robor should be implemented the eating method. 
// As The Interface Segregation Principle, clients should not be force to depend on methods that they do not use
// So IWorker is splitted in 2 different interface: IWorable and IFeedable.
// Then we need to modifide Manager Class again to work with Robot.

class Manager
{
	Manager(){
		
	}
	
	public void manage(){
		System.out.println("Managing... ");
	}
}

// This logic will work with future employees, which is implemented as IWorkable, 
// because the Manager only manages the working of employee.