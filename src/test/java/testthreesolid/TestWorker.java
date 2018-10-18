package threesolid;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;



public class TestWorker {

   private  Worker w = new Worker();
	
   @Test
   public void testWorkerWithNoName()
   {
      assertEquals(w.getName(),"");
      assertEquals(w.work(),"I'm working already!");
   }

   @Test
   public void testWorkerWithName()
   {
      w.setName("Corvus Glaive");
      assertEquals(w.getName(),"Corvus Glaive");
      assertEquals(w.work(),"Corvus Glaive is working very hard!");
   }

}