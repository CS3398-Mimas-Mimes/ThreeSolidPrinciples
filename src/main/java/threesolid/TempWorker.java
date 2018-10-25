package threesolid;

public class TempWorker extends BaseWorker implements IEat, ISick {
	@Override
    public String work() {
        return "TempWorker is working...";
    }

	@Override
    public void eat(){
       System.out.println("TempWorker is eating...");
   }

	@Override
	public void sick(){
       System.out.println("TempWorker is sick...");
   }
}