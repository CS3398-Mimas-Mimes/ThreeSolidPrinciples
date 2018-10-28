package threesolid;

public class TempWorker extends BaseWorker implements IEat, ISick {
	@Override
    public String work() {
        System.out.println("TempWorker is working...");
		return("TempWorker is working...");
    }

    public String eat(){
       System.out.println("TempWorker is eating...");
       return("TempWorker is eating...");
   }

   public String sick(){
       System.out.println("TempWorker is sick...");
       return("TempWorker is sick...");
   }
}
