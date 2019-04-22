package trabajo1;

/**
 * StringMatchingTest clase para testear los metodos de StringMatching.
 *
 */

import org.junit.Assert;
import org.junit.Test;

import trabajo1.StringMatching;

public class StringMatchingTest {

 
  
  /**
   * Prueba match. 
   * 
   */
  @Test
  public void probarMatch() {
	String text = "hola mucha gracias por probar el programa escrito en java";
	String pattern = "programa";
	
	int res = StringMatching.match(text,pattern);
    int expectedRes = 33;
    Assert.assertEquals(expectedRes, res); 
    
  }
  
  /**
   * Prueba matchKmp. 
   * 
   */
  @Test
  public void probarMatchKmp() {
	String text = "hola mucha gracias por probar el programa escrito en java";
	String pattern = "programa";
	
	int res = StringMatching.matchKmp(text,pattern);
    int expectedRes = 33;
    Assert.assertEquals(expectedRes, res); 
    
  }
  
}
