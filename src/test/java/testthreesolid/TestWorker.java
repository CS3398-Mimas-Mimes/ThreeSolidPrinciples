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
   // A13 tests
   @Test
   @DisplayName("Work Method Test Passed")
   public void newtestAHWorkerPass()
   {
       String workMsg = w.work();
       assertNotEquals(workMsg, "Worker is working...", "Match between test text and method text");
   }
    
   @Test
   @DisplayName("Work Method Test Failed")
   public void newtestAHWorkerFail()
   {
       String workMsg = w.work();
       assertEquals(workMsg, "Worker is working...", "Match between test text and method text");
   }
}
