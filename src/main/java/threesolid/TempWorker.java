package threesolid;

public class TempWorker extends BaseWorker implements IEat, ISick {
	@Override
    public void work() {
        System.out.println("TempWorker is working...");
    }

    public void eat(){
       System.out.println("TempWorker is eating...");
   }

   public void sick(){
       System.out.println("TempWorker is sick...");
   }
}