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
   
   /*
		Sample Test
   */
	
   @Test
   @DisplayName("Work Method Test")
   public void sampleTest()
   {
      String tester = w.work();
      assertEquals(tester,"Work is happening...", "Mismatch between test text and method test");
   }
   
   /*
		Requirement Tests
		Assignment A13
   */
   
   @Test
   @DisplayName("Work Method passes tests")
   public void newTestDPWorkerPass(){
	assertTrue(w.work().equals("Work is happening..."), "Misnatch results");
   }
   
   @Test
   @DisplayName("Work Method fails tests")
   public void newTestDPWorkerFail(){
	assertNotEquals(w.work(), "Work is happening...", "Same Message");
   }
   
   /*
		Extra Tests
   */
   
   @Test
   @DisplayName("Eat Method passes tests")
   public void newTestDPEatPass(){
	assertNotNull("Method eat return Null", w.eat());
   } 

   @Test
   @DisplayName("Eat Method fails tests")
   public void newTestDPEatFail(){
	assertNull("Method eat return a message (not NULL)", w.eat());
   }    
   
   @Test
   @DisplayName("Sick Method passes tests")
   public void newTestDPSickPass(){
	assertTrue(w.sick().equals("Worker is sick..."), "Misnatch results");
   }   
   
   @Test
   @DisplayName("Sick Method fails tests")
   public void newTestDPSickFail(){
	assertNotEquals(w.sick(), "Worker is sick...", "Misnatch results");
   } 
}
