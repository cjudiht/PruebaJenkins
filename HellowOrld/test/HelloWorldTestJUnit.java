/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author CJUDITH
 */
public class HelloWorldTestJUnit {
    
   String message = "Hello World";	
   HelloWorld hw = new HelloWorld();
   String messageUtil = hw.mensaje();
   
   @Test
   public void testPrintMessage() {
      assertEquals(message,messageUtil);
   }

    
}
