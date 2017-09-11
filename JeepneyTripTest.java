import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class JeepneyTripTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testTripCreated() {
    JeepneyTrip t = new JeepneyTrip(5, 5, 3);
    
    assertEquals(5.0, t.distance);
    assertEquals(5, t.totalPassengers);
    assertEquals(3, t.discountPassengers);
  }
  
  public void testChangeNoDiscount() {
    JeepneyTrip t = new JeepneyTrip(5, 1, 0);
    JeepneyTrip u = new JeepneyTrip(5, 5, 0);
    
    assertEquals(3.0, t.fareChange(10));
    assertEquals(15.0, u.fareChange(50));
  }
  
  public void testChangeDiscount() {
    JeepneyTrip t = new JeepneyTrip(5, 1, 1);
    JeepneyTrip u = new JeepneyTrip(5, 5, 3);
    
    assertEquals(4.0, t.fareChange(10));
    assertEquals(18.0, u.fareChange(50));
  }
  
  public void testChangeNoDiscountAbove5() {
    JeepneyTrip t = new JeepneyTrip(6.5, 3, 0);
    JeepneyTrip u = new JeepneyTrip(8, 5, 0);
    
    assertEquals(26.75, t.fareChange(50));
    assertEquals(57.5, u.fareChange(100));
  }
  
  public void testChangeDiscountAbove5() {
    JeepneyTrip t = new JeepneyTrip(6.5, 1, 1);
    JeepneyTrip u = new JeepneyTrip(8, 5, 3);
    
    assertEquals(3.25, t.fareChange(10));
    assertEquals(10.5, u.fareChange(50));
  }
  
  public void testAdditionalFare() {
    JeepneyTrip t = new JeepneyTrip(6.5, 1, 1);
    JeepneyTrip u = new JeepneyTrip(8, 5, 3);
    
    assertEquals(0.75, t.additionalFare());
    assertEquals(7.5, u.additionalFare());
  }
  
  public void testActualFare() {
    JeepneyTrip t = new JeepneyTrip(6.5, 3, 0);
    JeepneyTrip u = new JeepneyTrip(8, 5, 3);
    
    assertEquals(23.25, t.actualFare());
    assertEquals(39.5, u.actualFare());
  }
}
