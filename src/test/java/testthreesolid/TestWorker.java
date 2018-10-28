package threesolid;

import static org.junit.jupiter.api.Assertions.*;


import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInstance;
import org.junit.jupiter.api.extension.ExtendWith;



public class TestWorker {

   private  Worker w = new Worker();
	
   @Test
   @DisplayName("Work Method Test")
   public void testWorkerWithNoName()
   {
      String tester = w.work();
      assertEquals(tester,"Work is happening...", "Mismatch between test text and method test");
   }


      @Test
   @DisplayName("Sick Method Test")
   public void newtest_CL_WorkerPass()
   {
       String tester2 = w.sick();
       assertTrue(tester2 != "nothing"); 
   }
 
   @Test
   @DisplayName("Sick Method Test")
    public void newtest_CL_WorkerFail()
   {
       String tester3 = w.sick();
       assertNull(tester3 ); 
   }
   
}
