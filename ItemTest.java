import junit.framework.TestCase;

/**
 * A JUnit test case class.
 * Every method starting with the word "test" will be called when running
 * the test with JUnit.
 */
public class ItemTest extends TestCase {
  
  /**
   * A test method.
   * (Replace "X" with a name describing the test.  You may write as
   * many "testSomething" methods in this class as you wish, and each
   * one will be called when running JUnit over this class.)
   */
  public void testItemSale() {
    Item a = new Item(800, 0.10);
    Item b = new Item(1500, 0.15);
    Item c = new Item(1000, 0.20);
    Item d = new Item(1001, 0.10);
    Item e = new Item(999, 0.10);
    
    assertEquals(800, a.price);
    assertEquals(0.10, a.sale);
    assertEquals(1500, b.price);
    assertEquals(0.15, b.sale);
    assertEquals(1000, c.price);
    assertEquals(0.20, c.sale);
    assertEquals(1001, d.price);
    assertEquals(0.10, d.sale);
    assertEquals(999, e.price);
    assertEquals(0.10, e.sale);
  }
  
  public void testComputeSalePrice() {
    Item a = new Item(800, 0.10);
    Item b = new Item(1500, 0.15);
    Item c = new Item(1000, 0.20);
    Item d = new Item(1001, 0.10);
    Item e = new Item(999, 0.10);
    
    assertEquals(720.0, a.computeSalePrice());
    assertEquals(1275.0, b.computeSalePrice());
    assertEquals(800.0, c.computeSalePrice());
    assertEquals(900.9, d.computeSalePrice());
    assertEquals(899.1, e.computeSalePrice());
  }
  
  public void testSalePrice1000() {
    Item a = new Item(800, 0.10);
    Item b = new Item(1500, 0.15);
    Item c = new Item(1000, 0.20);
    Item d = new Item(1001, 0.10);
    Item e = new Item(999, 0.10);
    
    assertEquals(800.0, a.salePrice1000());
    assertEquals(1275.0, b.salePrice1000());
    assertEquals(1000.0, c.salePrice1000());
    assertEquals(900.9, d.salePrice1000());
    assertEquals(999.0, e.salePrice1000());
  }
  
}
