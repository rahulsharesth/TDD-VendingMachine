import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;

/**
 * 
 */

/**
 * @author Rahul Sharesth
 *
 */
public class VendingMachineTest {

    private VendingMachine vendingMachine = null;

    @Before
    public void setup() {
        Stock stock = new Stock(pepsiCan, 10);
        vendingMachine = new VendingMachine();
        final Can pepsiCan = new Can(CanType.PEPSI, 100);
        vendingMachine.load(pepsiCan, stock);
    }


    @Test
    public void should_return_pepsi() {       
        Can can = vendingMachine.getCan(CanType.PEPSI, 100);
        assertEquals(CanType.PEPSI, can.getCanType());
    }

    @Test
    public void should_not_return_sevenup() {       
        Can can = vendingMachine.getCan(CanType.SEVENUP, 100);
        assertNull(can);
    }
    
    @Test
    public void should_return_change() {
        final Can can = vendingMachine.getCan(CanType.PEPSI, 120);
        double change = vendingMachine.getChange();
        assertEquals(change, 20, 0);
    }
    
    @Test
    public void should_return_no_change() {
        double change = vendingMachine.getChange();
        assertEquals(change, 0, 0);
    }

}
